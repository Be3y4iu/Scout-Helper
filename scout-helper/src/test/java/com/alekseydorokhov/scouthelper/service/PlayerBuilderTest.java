package com.alekseydorokhov.scouthelper.service;

import com.alekseydorokhov.scouthelper.model.player.Club;
import com.alekseydorokhov.scouthelper.model.player.Player;
import com.alekseydorokhov.scouthelper.model.player.Position;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class PlayerBuilderTest {

    @DataProvider(name = "players")
    public Object[][] getPlayers(){
        return new Object[][]{
                {
                "Igor linav", Position.CENTRAL_BOXTOBOX_MIDFIELDER, Club.LIVERPOOL, 16
            },
                {
                "Alex  Voronov", Position.CENTRAL_FORWARD, Club.REAL_MADRID, 25
            },
                {
                "Petrol Larvon", Position.CENTRAL_ATTACKING_MIDFIELDER, Club.REAL_MADRID, 23
            },
 {
                "Lin cer", Position.GOALKEEPER, Club.LIVERPOOL, 32
            },
 {
                "Ar ger", Position.DRAWN_STRIKER, Club.LIVERPOOL, 18
            },
 {
                "le Valon Darolec", Position.LEFT_MIDFIELDER, Club.REAL_MADRID, 21
            },

        };
    }

    @Test(dataProvider = "players")
    public void normalOrderTest(String name, Position position, Club club, int age){
        Player player = new Player(name, position, club, age);
        PlayerBuilder playerBuilder = new PlayerBuilder();
        Player builded = playerBuilder.setName(name)
                .setPosition(position)
                .setCurrentTeam(club)
                .setAge(age)
                .build();
        assertEquals(builded, player);
    }

    @Test(dataProvider = "players")
    public void reversedOrderTest(String name, Position position, Club club, int age){
        Player player = new Player(name, position, club, age);
        PlayerBuilder playerBuilder = new PlayerBuilder();
        Player builded = playerBuilder.setAge(age)
                .setCurrentTeam(club)
                .setPosition(position)
                .setName(name)
                .build();
        assertEquals(builded, player);
    }

    @Test(dataProvider = "players")
    public void randomOrderTest(String name, Position position, Club club, int age){
        Player player = new Player(name, position, club, age);
        PlayerBuilder playerBuilder = new PlayerBuilder();
        Player builded = playerBuilder.setPosition(position)
                .setAge(age)
                .setCurrentTeam(club)
                .setName(name)
                .build();
        assertEquals(builded, player);
    }

}