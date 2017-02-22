package com.ran.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = GET)
    private String sayHello() {
        return "Hello,Spring Boot!";
    }
}
