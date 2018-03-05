package com.think.queueservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping(method= RequestMethod.GET, value="/")
    public String sayHello() {
        return "Welcome to the default screen for " + appName;
    }
}
