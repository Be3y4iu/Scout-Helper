package com.alekseydorokhov.scouthelper.service;

import com.alekseydorokhov.scouthelper.model.player.Player;
import com.alekseydorokhov.scouthelper.model.player.Position;
import com.alekseydorokhov.scouthelper.model.player.Club;

public class PlayerBuilder {
    private String name;
    private Position position;
    private Club currentTeam;
    private int age;

    public Player build(){
        return new Player(name, position, currentTeam, age);
    }

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder setPosition(Position position) {
        this.position = position;
        return this;
    }

    public PlayerBuilder setCurrentTeam(Club currentTeam) {
        this.currentTeam = currentTeam;
        return this;
    }

    public PlayerBuilder setAge(int age) {
        this.age = age;
        return this;
    }
}
