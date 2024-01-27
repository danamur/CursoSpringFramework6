package com.danielnamur.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Curso Spring Boot");
        model.addAttribute("name", "Daniel");
        model.addAttribute("lastname", "Namur");
        
        return "details";
    }

}
