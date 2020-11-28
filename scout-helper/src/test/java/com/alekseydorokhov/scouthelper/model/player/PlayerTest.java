package com.alekseydorokhov.scouthelper.model.player;

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
    public void checkCreation(Object[] args){
        String name = args[0].toString();
        Position position = (Position)args[1];
        Club team = (Club)args[2];
        int age = (int)args[3];
        Player player = new Player(name, position, team, age);
        assertEquals(player.getName(), name);
        assertEquals(player.getPosition(), position);
        assertEquals(player.getCurrentTeam(), team);
        assertEquals(player.getAge(), age);
        //logger.info("id: " + player.getId());
    }

}