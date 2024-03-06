package com.danielnamur.springboot.error.springbooterror.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielnamur.springboot.error.springbooterror.exceptions.UserNotFoundException;
import com.danielnamur.springboot.error.springbooterror.models.domain.User;
import com.danielnamur.springboot.error.springbooterror.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String index() {
        //int value = 100 / 0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok";
    }

    @GetMapping("/user/{id}")
    public User show(@PathVariable Long id) {
        User user = service.findById(id);
        if (user == null) {
            throw new UserNotFoundException("El usuario no existe");
        }
        System.out.println(user.getName());
        return user;
    }

    @GetMapping("/users")
    public List<User> showAll() {
        return service.findAll();
    }
    
}