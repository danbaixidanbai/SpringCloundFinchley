package com.ouxuxi.eurekafeign.dao;

import com.ouxuxi.eurekafeign.dao.impl.FeignDaoHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-01",fallback = FeignDaoHystric.class,configuration= FeignClientsConfiguration.class)
public interface FeignDao {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
