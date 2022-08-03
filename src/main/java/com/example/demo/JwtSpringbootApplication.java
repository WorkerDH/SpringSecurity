package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.security.core.context.SecurityContextHolder;

@SpringBootApplication
@EnableCaching
public class JwtSpringbootApplication {

    public static void main(String[] args) {
        SecurityContextHolder.getContext();
        SpringApplication.run(JwtSpringbootApplication.class, args);

    }

}
