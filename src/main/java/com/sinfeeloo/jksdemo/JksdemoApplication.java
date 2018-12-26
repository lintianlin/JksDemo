package com.sinfeeloo.jksdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class JksdemoApplication {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JksdemoApplication.class, args);
    }
}

