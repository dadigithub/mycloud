package com.dadi.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController_Consumer {
//    @Autowired
//    private RestTemplate restTemplate;


    @RequestMapping(value = "/findProvider")
    public String findProvider() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8001/dept/list",String.class);
        String value = entity.getBody();
        System.out.println("value = " + value);
        return value;
    }


}
