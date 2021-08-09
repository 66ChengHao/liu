package com.example.liu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test_1Controller {
    @Autowired
    @GetMapping("/test")
    public String test_1(){return "hello test_1";}
}
