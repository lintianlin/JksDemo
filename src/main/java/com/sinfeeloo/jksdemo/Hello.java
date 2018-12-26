package com.sinfeeloo.jksdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello 大傻逼！6666, " + new Date();
    }
}
