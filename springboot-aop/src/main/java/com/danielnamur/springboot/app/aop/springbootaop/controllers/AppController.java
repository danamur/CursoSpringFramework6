package com.danielnamur.springboot.app.aop.springbootaop.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.danielnamur.springboot.app.aop.springbootaop.services.AppService;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping("")
    public ResponseEntity<?> getMethodName() {
        return ResponseEntity.ok(Collections.singletonMap("message", appService.sayHi("Daniel", "Buenos dias,")));
    }
    
}
