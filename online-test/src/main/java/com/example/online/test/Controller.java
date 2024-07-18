package com.example.online.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/site")
public class Controller {
    @GetMapping("/hello")
    public String hey(){
        return "hello, welcome to production";
    }
}
