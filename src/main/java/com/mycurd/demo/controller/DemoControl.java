package com.mycurd.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControl {

    @GetMapping("/demo")
    public String demo(){
        System.out.println("Hello my demo control");
        return "Welcome to my demo control - with H2 DB";
    }
}
