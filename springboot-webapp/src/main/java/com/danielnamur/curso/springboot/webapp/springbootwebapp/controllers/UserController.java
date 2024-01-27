package com.danielnamur.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details() {
        return "details";
    }

}
