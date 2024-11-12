package com.io.github.guiqwer.PlayLog.dto;


import com.io.github.guiqwer.PlayLog.entities.GameList;

public class GameListDTO {
    private long id;
    private String name;

    public GameListDTO(){

    }

    public GameListDTO(GameList entity  ) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

}
