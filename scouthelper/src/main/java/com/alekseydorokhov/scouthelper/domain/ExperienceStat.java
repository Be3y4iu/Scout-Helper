package com.alekseydorokhov.scouthelper.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ExperienceStat  {

    @Id
    @GeneratedValue
    private long id;

    private int totalMatches;
    private long totalGameMinutes;
    private int totalRedCards;
    private int totalYellowCards;
}
