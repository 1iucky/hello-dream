package com.dream.hellodream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloDreamApplication {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloDreamApplication.class, args);
    }

}
