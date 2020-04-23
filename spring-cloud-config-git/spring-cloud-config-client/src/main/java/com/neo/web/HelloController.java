package com.neo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @Value("${neo.hello}") //从这个配置读取的值: neo.hello=hello im dev update 2
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}