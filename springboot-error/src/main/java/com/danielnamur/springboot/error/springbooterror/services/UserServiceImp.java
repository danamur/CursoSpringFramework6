package com.danielnamur.springboot.error.springbooterror.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Optional<User> findById(Long id) {
        User user = null;

        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }
        
        return Optional.ofNullable(user);
    }

    @Override
    public List<User> findAll() {
        return users;
    }

}
