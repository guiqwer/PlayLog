package com.io.github.guiqwer.PlayLog.controllers;

import com.io.github.guiqwer.PlayLog.dto.GameMinDto;
import com.io.github.guiqwer.PlayLog.entities.Game;
import com.io.github.guiqwer.PlayLog.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll(){
        List<GameMinDto> result = gameService.findAll();
        return result;
    }
}
