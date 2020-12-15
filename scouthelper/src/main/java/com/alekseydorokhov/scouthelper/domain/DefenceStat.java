package com.alekseydorokhov.scouthelper.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class DefenceStat {

    @Id
    @GeneratedValue
    private long id;

    private double averageRetakes;
    protected double averageBallTackles;
    private int totalDryMatches;
    private int totalGoalsConceded;

}
