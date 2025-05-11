package com.alots.alots_backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthController {
    @GetMapping("/health")
    public String checkHealth(){
        return "ALOTs backend is up and running!";
    }

}
