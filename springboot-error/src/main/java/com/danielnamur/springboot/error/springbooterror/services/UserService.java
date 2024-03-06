package com.danielnamur.springboot.error.springbooterror.services;

import java.util.List;

import com.danielnamur.springboot.error.springbooterror.models.domain.User;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
