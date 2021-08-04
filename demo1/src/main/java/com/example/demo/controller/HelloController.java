package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo1
 * @description:
 * @author: max-qaq
 * @create: 2021-08-04 22:19
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello!";
    }
}
