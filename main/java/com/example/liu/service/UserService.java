package com.example.liu.service;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.liu.entiy.User;
import com.example.liu.mapper.UserMapper;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private static UserMapper userMapper;
    //该注解可以对类成员变量、方法以及构造函数进行标注，完成自动装配工作

    public static String login(User user){
        //登录逻辑函数
        try{
            if(user.getUsername()==null){
                System.out.print("error");
            }
            User userExistN = userMapper.findByName(user.getUsername());
            if(userExistN!=null){
                String userExistP = userMapper.findPswByName(user.getUsername());
                if(userExistP.equals(user.getPassword())){
                    return user.getUsername()+"登录成功，欢迎您!";
                }else {
                    return "登录失败，密码错误!";
                }
            }else {
                return "登录失败，用户不存在!";
            }
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public static String regist(User user){
        //注册逻辑函数
        try {
            UserMapper userMapper = null;
            User userExist = userMapper.findByName(user.getUsername());
            if (user.getUsername().equals("")){
                return "用户名不能为空";
            }else if (user.getPassword().equals("")){
                return "密码不能为空";
            }else if (userExist!=null){
                return "账户已经存在";
            }else{
                userMapper.save(user);
                return "注册成功";
            }
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }

    }

    public List<User> findAll(){
        UserMapper userMapper = null;
        List<User> list = userMapper.findAll();
        return list;
    }
}

