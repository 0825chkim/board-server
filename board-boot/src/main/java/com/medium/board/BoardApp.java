package com.medium.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.medium")
public class BoardApp {
    public static void main(String[] args) {
        SpringApplication.run(BoardApp.class, args);
    }

    @GetMapping
    public String test(){
        return "Hello World";
    }
}
