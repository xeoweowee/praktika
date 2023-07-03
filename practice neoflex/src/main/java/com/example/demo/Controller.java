package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller {

    public static void main(String[] args) {
        SpringApplication.run(Controller.class, args);
    }

    @GetMapping("/plus/{a}/{b}")
    public Integer plus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return a + b;
    }

    @GetMapping("/minus/{a}/{b}")
    public Integer minus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return a - b;
    }

    @GetMapping("/error")
    public String handleError() {
        return "Error occurred.";
    }
}
