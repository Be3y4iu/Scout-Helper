package com.alekseydorokhov.scouthelper.controller;

import com.alekseydorokhov.scouthelper.domain.Player;
import com.alekseydorokhov.scouthelper.model.Criteria;
import com.alekseydorokhov.scouthelper.service.PlayerRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class WebController {

    @Autowired
    private PlayerRepositoryService repositoryService;

    @GetMapping
    public String index(Model model){
        model.addAttribute("players", repositoryService.getAll());
        return "index";
    }

    @PostMapping("/filter")
    public String searchPlayers(@RequestBody Criteria criteria, Model model){
        List<Player> players = repositoryService.getPlayerRepository().findAll(criteria.createSpecification());
        model.addAttribute("players", players);
        System.out.println("OGO");
        return "redirect:/";
    }

    @GetMapping("players/{id}")
    public String getPlayerPage(@RequestParam long id, Model model){
        model.addAttribute("player", repositoryService.getPlayerRepository().findById(id).get());
        return "player";
    }

//    @GetMapping
//    public String search(@RequestParam, Model model){
//        model.addAttribute("players", repositoryService.getAll());
//        return "index";
//    }

}
