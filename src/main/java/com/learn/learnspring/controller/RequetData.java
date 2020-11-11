package com.learn.learnspring.controller;


import com.learn.learnspring.service.LearnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RequetData {
    private static final Logger logger = LoggerFactory.getLogger(RequetData.class);

    @Autowired
    private LearnService learnService;

    @RequestMapping("/request")
    public String request(@RequestBody Map map) {
        String action = null;
        if (map.get("action") == null) {
            return "Failure! Don't have action name";
        } else {
            String resp = learnService.provideService(map);
            return resp;
        }
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello,world";
    }

}
