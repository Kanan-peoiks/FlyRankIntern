package com.example.flyrankbackendintern.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TaskController {
    @GetMapping("/")
    public String hiServer() {
        return "Hello World!";
    }

    @GetMapping("/apiInfo")
    public Map<String, Object> getApiInfo() {
        Map<String, Object> info = new HashMap<>();
        info.put("name", "Task API");
        info.put("version", "1.0");
        info.put("endpoints", List.of("/tasks"));
        return info;
    }

    @GetMapping("/health")
    public Map<String, String> healthCheck() {
        return Map.of("status", "ok");
    }
}
