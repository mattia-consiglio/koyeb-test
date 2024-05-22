package com.koyeb.authclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${spring.datasource.username}")
    String username;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world! " + username;
    }
}
