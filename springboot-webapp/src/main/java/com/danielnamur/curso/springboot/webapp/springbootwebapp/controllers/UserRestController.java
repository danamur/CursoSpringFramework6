package com.danielnamur.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    
    @GetMapping("/api/details")
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Curso Spring Boot");
        body.put("name", "Daniel");
        body.put("lastname", "Namur");
        
        return body;
    }

}