package com.alekseydorokhov.scouthelper.service;

import com.alekseydorokhov.scouthelper.domain.Player;
import com.alekseydorokhov.scouthelper.domain.PlayerDTO;
import org.springframework.stereotype.Service;

@Service
public class PlayerConverter {

    public Player convertToPlayer(PlayerDTO playerDTO){
        return new PlayerBuilder().setName(playerDTO.getName())
                .setPosition(playerDTO.getPosition())
                .setCurrentClub(playerDTO.getCurrentClub())
                .setAge(playerDTO.getAge())
                .setAttackStat(playerDTO.getAttackStat())
                .setDefenceStat(playerDTO.getDefenceStat())
                .setExperienceStat(playerDTO.getExperienceStat())
                .setWorkingLeg(playerDTO.getWorkingLeg())
                .build();
    }

    public PlayerDTO convertToDTO(Player player){
        return new PlayerBuilder().setName(player.getName())
                .setPosition(player.getPosition())
                .setCurrentClub(player.getCurrentClub())
                .setAge(player.getAge())
                .setAttackStat(player.getAttackStat())
                .setDefenceStat(player.getDefenceStat())
                .setExperienceStat(player.getExperienceStat())
                .setWorkingLeg(player.getWorkingLeg())
                .buildDTO();
    }

}
