package com.ouxuxi.eurkaclient01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Eurkaclient01Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurkaclient01Application.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi")
    public String home(@RequestParam(value = "name", defaultValue = "ouxuxi") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
