package com.io.github.guiqwer.PlayLog.dto;


import com.io.github.guiqwer.PlayLog.entities.Game;

public class GameMinDto {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto() {

    }

    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        genre = entity.getGenre();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
