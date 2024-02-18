package com.danielnamur.springboot.di.app.springbootdi.services;

import java.util.List;

import com.danielnamur.springboot.di.app.springbootdi.models.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
}
