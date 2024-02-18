package com.danielnamur.springboot.di.app.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

import com.danielnamur.springboot.di.app.springbootdi.models.Product;

public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
            new Product(1L, "Procesador Intel Core i5", 150000L),
            new Product(2L, "Memoria RAM DDR4 8GB", 50000L),
            new Product(3L, "Disco Duro SSD 256GB", 70000L),
            new Product(4L, "Tarjeta Gráfica NVIDIA GTX 1660", 250000L),
            new Product(5L, "Placa Madre ASUS B450", 100000L),
            new Product(6L, "Fuente de Poder 600W", 60000L),
            new Product(7L, "Gabinete ATX RGB", 80000L),
            new Product(8L, "Teclado Mecánico RGB", 60000L),
            new Product(9L, "Mouse Gamer con Cable", 40000L),
            new Product(10L, "Monitor LED 24 Pulgadas", 150000L)
        );
    }

    /**
     * Retorna una lista de todos los productos.
     * Este método sobrescribe el método definido en la interfaz ProductRepository.
     * Utiliza la lista de datos almacenada en esta clase para devolver todos los productos.
     * @return Una lista que contiene todos los productos disponibles.
    */
    @Override
    public List<Product> findAll() {
        return data;
    }

    /**
     * Encuentra un producto por su ID.
     * Busca en la lista de productos para encontrar el que tenga el ID proporcionado.
     * Si se encuentra un producto con el ID dado, se devuelve.
     * Si no se encuentra ningún producto con el ID dado, se devuelve null.
     * @param id El ID del producto que se quiere encontrar.
     * @return El producto encontrado, o null si no se encuentra ningún producto con el ID dado.
    */
    @Override
    public Product findById (Long id) {
        return data.stream().filter(p -> p.getId_product().equals(id)).findFirst().orElse(null);
    }

}
