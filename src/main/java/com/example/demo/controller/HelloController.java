package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    RedisTemplate redisTemplate;
    @GetMapping("/hello")
    public  String hello(){
        redisTemplate.opsForValue().set("test1","hello");
        Object obj= redisTemplate.opsForValue().get("test1");
        Object obj2= redisTemplate.opsForValue().get("test");
        return "hello";
    }
    @GetMapping("/")
    public String index(){
        redisTemplate.opsForValue().set("test","hello");
        return "index";
    }
}
