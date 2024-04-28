package com.example.cicdpractice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {

    @GetMapping("/")
    public String hi() {
        return "good";
    }
}
