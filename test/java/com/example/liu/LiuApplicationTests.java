package com.example.liu;

import com.example.liu.bean.Persion;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

@SpringBootTest
class LiuApplicationTests {
    @Autowired
    ApplicationContext ioc;

    @Test
    public void testConfig(){
        boolean b = ioc.containsBean("helloService");
        System.out.print(b);
    }


}
