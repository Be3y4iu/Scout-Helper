package com.alekseydorokhov.scouthelper.domain;

import com.alekseydorokhov.scouthelper.bean.Club;
import com.alekseydorokhov.scouthelper.bean.Position;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class PlayerTest {

    private static Logger logger = LogManager.getLogger(PlayerTest.class);

    @DataProvider(name = "players")
    public Object[][] getData(){
        return new Object[][]{
                {
                    "Nessi", Position.LEFT_MIDFIELDER, Club.REAL_MADRID, 32
                },
                {
                    "Alfred Bereh", Position.GOALKEEPER, Club.REAL_MADRID, 33
                },
                {
                    "Ronaldo Zalos", Position.CENTRAL_ATTACKING_MIDFIELDER, Club.LIVERPOOL, 22
                },
                {
                    "Richard Dellos", Position.RIGHT_FORWARD, Club.LIVERPOOL, 18
                },
                {
                    "Richter King", Position.LEFT_MIDFIELDER, Club.REAL_MADRID, 31
                },

        };
    }

    @Test(dataProvider = "players")
    public void checkCreation(String name, Position position, Club club, int age){
        Player player = new Player(name, position, club, age);
        assertEquals(player.getName(), name);
        assertEquals(player.getPosition(), position);
        assertEquals(player.getCurrentClub(), club);
        assertEquals(player.getAge(), age);
        //logger.info("id: " + player.getId());
    }

}