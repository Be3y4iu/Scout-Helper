package com.alekseydorokhov.scouthelper.controller;

import com.alekseydorokhov.scouthelper.model.player.Club;
import com.alekseydorokhov.scouthelper.model.player.Player;
import com.alekseydorokhov.scouthelper.model.player.Position;
import com.alekseydorokhov.scouthelper.service.PlayerBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/rest/")
public class RestAppController {

    @GetMapping("player")
    public ResponseEntity<?> sendPlayer(){
        return new ResponseEntity<>(new PlayerBuilder().setAge(24)
                .setCurrentTeam(Club.REAL_MADRID)
                .setPosition(Position.GOALKEEPER)
                .setName("Alexandro Doneckiy")
        .build(),
                HttpStatus.OK);
    }

    @GetMapping("number")
    public ResponseEntity<Integer> sendNumber(){
        return ResponseEntity.ok(113);
    }

}
