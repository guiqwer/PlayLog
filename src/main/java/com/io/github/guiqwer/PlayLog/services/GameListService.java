package com.io.github.guiqwer.PlayLog.services;

import com.io.github.guiqwer.PlayLog.dto.GameDTO;
import com.io.github.guiqwer.PlayLog.dto.GameListDTO;
import com.io.github.guiqwer.PlayLog.dto.GameMinDTO;
import com.io.github.guiqwer.PlayLog.entities.Game;
import com.io.github.guiqwer.PlayLog.entities.GameList;
import com.io.github.guiqwer.PlayLog.repositories.GameListRepository;
import com.io.github.guiqwer.PlayLog.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//componet register
@Service
public class GameListService {

    //inject GameRepository in gameservice
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> gameLists = gameListRepository.findAll();
        return gameLists.stream().map(x-> new GameListDTO(x)).toList();
    }
}
