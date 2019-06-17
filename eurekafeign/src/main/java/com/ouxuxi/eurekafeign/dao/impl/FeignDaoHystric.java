package com.ouxuxi.eurekafeign.dao.impl;

import com.ouxuxi.eurekafeign.dao.FeignDao;
import org.springframework.stereotype.Component;

@Component
public class FeignDaoHystric implements FeignDao {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
