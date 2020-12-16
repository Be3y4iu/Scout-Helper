package com.alekseydorokhov.scouthelper.controller;

import com.alekseydorokhov.scouthelper.bean.Club;
import com.alekseydorokhov.scouthelper.bean.Position;
import com.alekseydorokhov.scouthelper.domain.Player;
import com.alekseydorokhov.scouthelper.domain.PlayerDTO;
import com.alekseydorokhov.scouthelper.model.Criteria;
import com.alekseydorokhov.scouthelper.model.Filter;
import com.alekseydorokhov.scouthelper.service.PlayerBuilder;
import com.alekseydorokhov.scouthelper.service.PlayerConverter;
import com.alekseydorokhov.scouthelper.service.PlayerRepositoryService;
import com.alekseydorokhov.scouthelper.service.validator.PlayerValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class RestAppController {

    private static Logger logger = LogManager.getLogger(RestAppController.class);

    @Autowired
    private PlayerValidator validator;

    @Autowired
    private PlayerRepositoryService repositoryService;

    @Autowired
    private PlayerConverter converter;

    @PostMapping("/add")
    public ResponseEntity<String> addPlayer(@RequestBody PlayerDTO playerDTO){
        logger.info(playerDTO);
        Player player = converter.convertToPlayer(playerDTO);
        logger.info(player);
        if(!validator.isValidPlayer(player))
            return ResponseEntity.status(400).body("Some player characteristics are invalid");
        if(!repositoryService.add(player)){
            return ResponseEntity.status(400).body("Player with name `" + player.getName() + "` already exists");
        }
        return ResponseEntity.ok("Player has been added");
    }

    @PostMapping("/search")
    public ResponseEntity<List<Player>> search(@RequestBody Criteria criteria){
        return ResponseEntity.ok(repositoryService.getPlayerRepository().findAll(criteria.createSpecification()));
    }

    @GetMapping("/getAll")
    public ResponseEntity<Iterable<Player>> getAllPlayers(){
        return ResponseEntity.ok(repositoryService.getAll());
    }

}
