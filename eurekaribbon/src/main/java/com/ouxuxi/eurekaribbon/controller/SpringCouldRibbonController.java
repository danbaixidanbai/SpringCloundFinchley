package com.ouxuxi.eurekaribbon.controller;

import com.ouxuxi.eurekaribbon.service.SpringCouldRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCouldRibbonController {

    @Autowired
    SpringCouldRibbonService springCouldRibbonService;

    @GetMapping(value = "/test")
    private  String testSpringCouldRibbon(@RequestParam String name){
        return springCouldRibbonService.springCouldRibbonTest(name);
    }
}
