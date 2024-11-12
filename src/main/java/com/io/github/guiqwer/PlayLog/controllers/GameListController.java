package com.io.github.guiqwer.PlayLog.controllers;


import com.io.github.guiqwer.PlayLog.dto.GameListDTO;
import com.io.github.guiqwer.PlayLog.dto.GameMinDTO;
import com.io.github.guiqwer.PlayLog.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
