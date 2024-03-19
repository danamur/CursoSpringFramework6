package com.danielnamur.springboot.app.aop.springbootaop.services;

import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    @Override
    public String sayHi(String person, String phrase) {
        String greeting = phrase + " " + person;
        System.out.println(greeting);
        return greeting;
    }

}
