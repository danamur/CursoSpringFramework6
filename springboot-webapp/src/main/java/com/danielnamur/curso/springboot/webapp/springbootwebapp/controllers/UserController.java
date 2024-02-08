package com.danielnamur.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Lista de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel() {        
        User user = new User("Daniel", "Perez");
        User user1 = new User("Daniel", "Namur");
        User user2 = new User("Daniel", "Namur");

        return Arrays.asList(user, user1, user2);
    }
}
