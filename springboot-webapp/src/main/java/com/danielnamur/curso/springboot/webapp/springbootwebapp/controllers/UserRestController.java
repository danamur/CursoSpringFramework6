package com.danielnamur.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details")
    public Map<String, Object> details() {

        User user = new User("Daniel", "Namur");

        Map<String, Object> body = new HashMap<>();
        body.put("title", "Curso Spring Boot");
        body.put("user", user);
        
        return body;
    }

}
