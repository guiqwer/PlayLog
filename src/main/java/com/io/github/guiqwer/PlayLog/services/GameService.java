package com.io.github.guiqwer.PlayLog.services;

import com.io.github.guiqwer.PlayLog.dto.GameDTO;
import com.io.github.guiqwer.PlayLog.dto.GameMinDTO;
import com.io.github.guiqwer.PlayLog.entities.Game;
import com.io.github.guiqwer.PlayLog.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//componet register
@Service
public class GameService {

    //inject GameRepository in gameservice
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
