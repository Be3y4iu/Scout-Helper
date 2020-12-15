package com.alekseydorokhov.scouthelper.service;

import com.alekseydorokhov.scouthelper.bean.Club;
import com.alekseydorokhov.scouthelper.bean.Position;
import com.alekseydorokhov.scouthelper.bean.WorkingLeg;
import com.alekseydorokhov.scouthelper.domain.AttackStat;
import com.alekseydorokhov.scouthelper.domain.DefenceStat;
import com.alekseydorokhov.scouthelper.domain.ExperienceStat;
import com.alekseydorokhov.scouthelper.domain.Player;
import com.alekseydorokhov.scouthelper.domain.PlayerDTO;

public class PlayerBuilder {
    private String name;
    private Position position;
    private WorkingLeg workingLeg;
    private Club currentClub;
    private int age;
    private AttackStat attackStat;
    private DefenceStat defenceStat;
    private ExperienceStat experienceStat;

    public Player build(){
        return new Player(name, position, workingLeg, currentClub, age, attackStat, defenceStat, experienceStat);
    }

    public PlayerDTO buildDTO() {
        return new PlayerDTO(name, position, workingLeg, currentClub, age, attackStat, defenceStat, experienceStat);
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

    public PlayerBuilder setWorkingLeg(WorkingLeg workingLeg) {
        this.workingLeg = workingLeg;
        return this;
    }

    public PlayerBuilder setAttackStat(AttackStat attackStat) {
        this.attackStat = attackStat;
        return this;
    }

    public PlayerBuilder setDefenceStat(DefenceStat defenceStat) {
        this.defenceStat = defenceStat;
        return this;
    }

    public PlayerBuilder setExperienceStat(ExperienceStat experienceStat) {
        this.experienceStat = experienceStat;
        return this;
    }
}
