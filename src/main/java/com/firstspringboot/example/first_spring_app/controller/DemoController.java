package com.firstspringboot.example.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody
@RequestMapping("/demo/apis")
public class DemoController {

    @GetMapping("/d1")
    public String getDemo1(){
        System.out.println("This is our first demo API - prints in server console");
        return "This is our first demo API - returns to user";
    }

    @GetMapping("/d2")
    public String getDemo2(){
        System.out.println("This is second  demo API - prints in server console");
        return "This is second  demo API - returns to user";
    }
}
