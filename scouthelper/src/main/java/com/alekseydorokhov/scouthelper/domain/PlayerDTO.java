package com.alekseydorokhov.scouthelper.domain;

import com.alekseydorokhov.scouthelper.bean.Club;
import com.alekseydorokhov.scouthelper.bean.Position;
import com.alekseydorokhov.scouthelper.bean.WorkingLeg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {
    private String name;
    private Position position;
    private WorkingLeg workingLeg;
    private Club currentClub;
    private int age;

    private AttackStat attackStat;
    private DefenceStat defenceStat;
    private ExperienceStat experienceStat;
}
