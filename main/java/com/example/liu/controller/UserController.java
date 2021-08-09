package com.example.liu.controller;

import com.example.liu.entiy.User;
import com.example.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(User user){
        return UserService.login(user);
    }

    @PostMapping("/regist")
    public String regist(User user){
        return UserService.regist(user);
    }

    /**
     * 解决查询数据库中文出现乱码问题
     * @return
     */
    @RequestMapping(value = "/alluser", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public List<User> findAll(){
        return userService.findAll();
    }
}

