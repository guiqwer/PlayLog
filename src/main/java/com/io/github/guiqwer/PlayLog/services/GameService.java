package com.io.github.guiqwer.PlayLog.services;

import com.io.github.guiqwer.PlayLog.dto.GameMinDto;
import com.io.github.guiqwer.PlayLog.entities.Game;
import com.io.github.guiqwer.PlayLog.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//componet register
@Service
public class GameService {

    //inject GameRepository in gameservice
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }
}
