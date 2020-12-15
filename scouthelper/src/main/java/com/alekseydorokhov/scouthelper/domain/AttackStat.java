package com.alekseydorokhov.scouthelper.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class AttackStat {

    @Id
    @GeneratedValue
    private long id;

    private int totalGoals;
    private int totalLegPasses;
    private int passesAccuracy;
    private double averageKeyPasses;

}
