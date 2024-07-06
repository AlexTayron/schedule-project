package com.example.demo.cadastrousuarios.controller;
import java.util.Map;

import java.util.Collections;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public Map<String, String> test() {
        return Collections.singletonMap("message", "Hello from Spring Boot!");
    }
}
