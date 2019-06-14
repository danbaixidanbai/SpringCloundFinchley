package com.ouxuxi.eurekafeign.controller;

import com.ouxuxi.eurekafeign.dao.FeignDao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {

    @Resource
    private FeignDao feignDao;

    @GetMapping(value = "/testfegin")
    public String sayHello(@RequestParam String name){
        return feignDao.sayHiFromClientOne(name);
    }
}
