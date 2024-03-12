package com.danielnamur.curso.spring.interceptor.springbootinterceptor.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/foo")
    public Map<String, String> foo() {
        return Collections.singletonMap("message", "foo");
    }

    @GetMapping("/bar")
    public Map<String, String> bar() {
        return Collections.singletonMap("message", "bar");
    }

    @GetMapping("/baz")
    public Map<String, String> baz() {
        return Collections.singletonMap("message", "baz");
    }

}
