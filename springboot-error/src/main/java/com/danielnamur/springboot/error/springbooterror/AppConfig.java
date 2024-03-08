package com.danielnamur.springboot.error.springbooterror;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.danielnamur.springboot.error.springbooterror.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    List<User> userInvoice() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Moe", "Szyslak"));
        users.add(new User(2L, "Barney", "Gumble"));
        users.add(new User(3L, "Lenny", "Leonard"));
        users.add(new User(4L, "Carl", "Carlson"));
        users.add(new User(5L, "Ned", "Flanders"));
        return users;
    }

}
