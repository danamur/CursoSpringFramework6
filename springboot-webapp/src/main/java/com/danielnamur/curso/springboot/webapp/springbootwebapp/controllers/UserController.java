package com.danielnamur.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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

    @GetMapping("/list")
    public String list(ModelMap model) {

        User user = new User("Daniel", "Namur");
        User user1 = new User("Daniel", "Namur");
        User user2 = new User("Daniel", "Namur");

        List<User> users = Arrays.asList(user, user1, user2);

        model.addAttribute("users", users);
        model.addAttribute("title", "Lista de usuarios");
        return "list";
    }
}
