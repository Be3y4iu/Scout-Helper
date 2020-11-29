package com.alekseydorokhov.scouthelper.controller;

import com.alekseydorokhov.scouthelper.service.PlayerRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

//    @GetMapping
//    public String search(@RequestParam, Model model){
//        model.addAttribute("players", repositoryService.getAll());
//        return "index";
//    }

}
