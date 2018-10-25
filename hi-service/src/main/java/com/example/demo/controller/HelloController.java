package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shaomin.lin
 * @Description:
 * @date 2018/6/27 0:31
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String say() {
        return "Hello Spring Boot!";
    }
}
