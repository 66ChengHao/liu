package com.example.liu.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.SplittableRandom;

@Controller
public class SuccessController {
    @RequestMapping("/success")
    public String success(Map<String, Object> map){
        map.put("Hello","Word");
        return "success";
    }
}
