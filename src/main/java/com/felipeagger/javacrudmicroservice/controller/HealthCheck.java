package com.felipeagger.javacrudmicroservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Service healthy!");
    }
}
