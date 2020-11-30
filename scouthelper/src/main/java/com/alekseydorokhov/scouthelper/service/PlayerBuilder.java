package com.alekseydorokhov.scouthelper.service;

import com.alekseydorokhov.scouthelper.bean.Club;
import com.alekseydorokhov.scouthelper.bean.Position;
import com.alekseydorokhov.scouthelper.domain.Player;
import com.alekseydorokhov.scouthelper.domain.PlayerDTO;

public class PlayerBuilder {
    private String name;
    private Position position;
    private Club currentClub;
    private int age;

    public Player build(){
        return new Player(name, position, currentClub, age);
    }

    public PlayerDTO buildDTO() {
        return new PlayerDTO(name, position, currentClub, age);
    }

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder setPosition(Position position) {
        this.position = position;
        return this;
    }


    public PlayerBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PlayerBuilder setCurrentClub(Club currentClub) {
        this.currentClub= currentClub;
        return this;
    }
}
