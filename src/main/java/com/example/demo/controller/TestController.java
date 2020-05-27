package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping("/test")
    public void test(){
        System.out.println("test");
    }
}
