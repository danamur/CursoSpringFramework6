package com.danielnamur.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.danielnamur.springboot.error.springbooterror.models.domain.User;

@Service
public class UserServiceImp implements UserService {

    private List<User> users;

    public UserServiceImp() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Moe", "Szyslak"));
        users.add(new User(2L, "Barney", "Gumble"));
        users.add(new User(3L, "Lenny", "Leonard"));
        users.add(new User(4L, "Carl", "Carlson"));
        users.add(new User(5L, "Ned", "Flanders"));
    }

    @Override
    public User findById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null; // Devuelve null si no se encuentra ningún usuario con el ID proporcionado
    }

    @Override
    public List<User> findAll() {
        return users;
    }

}
