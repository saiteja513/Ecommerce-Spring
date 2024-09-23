package com.learn.MyApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello, Happy learning";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is about me";
    }
}
