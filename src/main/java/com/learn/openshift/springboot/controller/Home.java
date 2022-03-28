package com.learn.openshift.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/")
    public String index() {
        return "SpringBoot application successfully deployed and running on Openshift";
    }
}
