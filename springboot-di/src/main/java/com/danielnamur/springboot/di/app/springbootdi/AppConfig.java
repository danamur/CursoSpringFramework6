package com.danielnamur.springboot.di.app.springbootdi;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:values.properties", encoding="UTF-8")
public class AppConfig {

}
