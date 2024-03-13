package com.danielnamur.curso.springboot.calendar.interceptor.springbootcalendarinterceptor.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/foo")
    public ResponseEntity<?> foo() {
        Map<String, Object> data = new HashMap<>();
        data.put("title", "Bienvenido al sistema");
        data.put("time", new Date());
        return ResponseEntity.ok(data);
    }

}
