package com.danielnamur.springboot.error.springbooterror.services;

import java.util.List;
import java.util.Optional;

import com.danielnamur.springboot.error.springbooterror.models.domain.User;

public interface UserService {

    Optional<User> findById(Long id);
    List<User> findAll();
}
