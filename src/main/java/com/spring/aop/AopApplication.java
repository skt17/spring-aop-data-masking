package com.spring.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(AopApplication.class, args);
    }

}
