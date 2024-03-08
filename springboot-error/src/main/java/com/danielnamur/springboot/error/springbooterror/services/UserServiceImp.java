package com.danielnamur.springboot.error.springbooterror.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielnamur.springboot.error.springbooterror.models.domain.User;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private List<User> users;

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter(u->u.getId().equals(id)).findFirst();
    }

    @Override
    public List<User> findAll() {
        return users;
    }

}
