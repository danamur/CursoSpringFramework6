package com.danielnamur.springboot.di.app.springbootdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import com.danielnamur.springboot.di.app.springbootdi.repositories.ProductRepository;
import com.danielnamur.springboot.di.app.springbootdi.repositories.ProductRepositoryJson;

@Configuration
@PropertySource(value="classpath:values.properties", encoding="UTF-8")
public class AppConfig {

    @Value("classpath:product.json")
    private Resource resource;
    
    @Bean("productJson")
    @Primary
    ProductRepository productRepositoryJson() {
        return new ProductRepositoryJson(resource);
    }

}
