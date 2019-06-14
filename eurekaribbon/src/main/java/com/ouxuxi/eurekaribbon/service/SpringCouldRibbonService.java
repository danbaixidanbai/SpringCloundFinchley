package com.ouxuxi.eurekaribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpringCouldRibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String springCouldRibbonTest(String name){
        return restTemplate.getForObject("http://SERVICE-01/hi?name="+name,String.class);
    }
}
