package com.sinfeeloo.jksdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello jenkins8888, " + new Date();
    }
}
