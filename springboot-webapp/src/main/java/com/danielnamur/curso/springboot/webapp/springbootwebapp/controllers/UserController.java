package com.danielnamur.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import models.User;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Daniel", "Namur");

        model.addAttribute("title", "Curso Spring Boot");
        model.addAttribute("user", user);
        
        return "details";
    }

}
