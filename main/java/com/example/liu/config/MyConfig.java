package com.example.liu.config;

import com.example.liu.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MyConfig {
    @Bean
    public HelloService helloService(){
        System.out.println("通过@Bean给容器添加了组件");
        return new HelloService();
    }
}
