package com.GameProjeto.list;

public class GamesList {
    private Long id;
    private String name;

    public GamesList(GameList entity){
        id = entity.getId();
        name = entity.getName();

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
