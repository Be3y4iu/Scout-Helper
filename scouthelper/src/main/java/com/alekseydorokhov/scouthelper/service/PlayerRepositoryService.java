package com.alekseydorokhov.scouthelper.service;

import com.alekseydorokhov.scouthelper.domain.Player;
import com.alekseydorokhov.scouthelper.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerRepositoryService {

    @Autowired
    private PlayerRepository playerRepository;

    public boolean add(Player player){
        if(playerRepository.existsByName(player.getName()))
            return false;
        playerRepository.save(player);
        return true;
    }

    public Iterable<Player> getAll(){
        return playerRepository.findAll();
    }

    //TODO delete
    public PlayerRepository getPlayerRepository(){
        return  playerRepository;
    }

}
