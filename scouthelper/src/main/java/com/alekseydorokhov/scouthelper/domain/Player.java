package com.alekseydorokhov.scouthelper.domain;

import com.alekseydorokhov.scouthelper.bean.Club;
import com.alekseydorokhov.scouthelper.bean.Position;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Position position;
    private Club currentClub;
    private int age;

    public Player(String name, Position position, Club currentClub, int age) {
        this.name = name;
        this.position = position;
        this.currentClub = currentClub;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return age == player.age &&
                Objects.equals(name, player.name) &&
                position == player.position &&
                currentClub == player.currentClub;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, currentClub, age);
    }
}
