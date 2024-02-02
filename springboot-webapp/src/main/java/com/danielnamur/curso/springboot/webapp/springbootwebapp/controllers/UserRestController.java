package com.danielnamur.curso.springboot.webapp.springbootwebapp.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import java.util.HashMap;
// import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.User;
import models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        User user = new User("Daniel", "Namur");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Curso Spring Boot 3");

        // Map<String, Object> body = new HashMap<>();
        // body.put("title", "Curso Spring Boot");
        // body.put("user", user);
        
        return userDto;
    }

    @GetMapping("/users")
    public List<User> List() {
        User user = new User("Daniel", "Namur");
        User user1 = new User("Daniel", "Namur");
        User user2 = new User("Daniel", "Namur");

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user1);
        // users.add(user2);

        List<User> users = Arrays.asList(user, user1, user2);

        return users;
    }
    
}
