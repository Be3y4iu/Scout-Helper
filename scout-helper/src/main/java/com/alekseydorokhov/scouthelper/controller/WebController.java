package com.alekseydorokhov.scouthelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(value = "/", produces = "text/plain;charset=UTF-8")
    public String index(){
        return "index";
    }

}
