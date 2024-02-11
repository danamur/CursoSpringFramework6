package com.danielnamur.curso.springboot.webapp.springbootwebapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    @PropertySource(value="classpath:values.properties", encoding="UTF-8")
})
public class AppConfig {

}
