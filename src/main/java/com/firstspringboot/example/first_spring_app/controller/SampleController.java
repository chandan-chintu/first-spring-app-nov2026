package com.firstspringboot.example.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/s1")
    public String getSample1(){
        return "This is our first sample API";
    }

    @GetMapping("/s2")
    public String getSample2(){
        return "This is our second sample API";
    }
}
