package com.alekseydorokhov.scouthelper.domain;

import com.alekseydorokhov.scouthelper.bean.Club;
import com.alekseydorokhov.scouthelper.bean.Position;
import com.alekseydorokhov.scouthelper.bean.WorkingLeg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Player {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Position position;

    @Enumerated(EnumType.STRING)
    private WorkingLeg workingLeg;

    @Enumerated(EnumType.STRING)
    private Club currentClub;
    private int age;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "attack_stat_id")
    private AttackStat attackStat;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "defence_stat_id")
    private DefenceStat defenceStat;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "experience_stat_id")
    private ExperienceStat experienceStat;


    public Player(String name, Position position, WorkingLeg workingLeg, Club currentClub, int age, AttackStat attackStat, DefenceStat defenceStat, ExperienceStat experienceStat) {
        this.name = name;
        this.position = position;
        this.workingLeg = workingLeg;
        this.currentClub = currentClub;
        this.age = age;
        this.attackStat = attackStat;
        this.defenceStat = defenceStat;
        this.experienceStat = experienceStat;
    }
}
