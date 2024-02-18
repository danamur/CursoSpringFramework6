package com.danielnamur.springboot.di.app.springbootdi.repositories;

import java.util.List;

import com.danielnamur.springboot.di.app.springbootdi.models.Product;

/**
 * Interfaz que define los métodos para acceder a los datos de los productos.
 * Esta interfaz proporciona un contrato para cualquier clase que desee implementarla.
 * Define dos métodos principales: findAll() para obtener todos los productos
 * y findById(Long id) para encontrar un producto por su ID.
 * Al definir esta interfaz, podemos desacoplar el código que utiliza los repositorios
 * de la implementación específica, lo que permite una mayor flexibilidad y modularidad en el diseño.
 */
public interface ProductRepository {
    List<Product> findAll();
    Product findById(Long id);
}
