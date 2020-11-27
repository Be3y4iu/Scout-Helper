package com.alekseydorokhov.scouthelper.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    private static Logger logger = LogManager.getLogger(WebController.class);

    @GetMapping(value = "/", produces = "text/plain;charset=UTF-8")
    public String index(){
        logger.info("Controller");
        System.out.println("sdfds");
        return "index";
    }

}
