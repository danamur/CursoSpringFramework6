package com.danielnamur.springboot.di.app.springbootdi.repositories;

import java.util.Arrays;
import java.util.List;

import com.danielnamur.springboot.di.app.springbootdi.models.Product;

public class ProductRepository {

    private List<Product> data;

    public ProductRepository() {
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

    public List<Product> findAll() {
        return data;
    }

    public Product findById (Long id) {
        // Utilizamos stream() para convertir la lista en un flujo de elementos.
        // Luego usamos filter() para filtrar los elementos según el ID proporcionado.
        // Usamos findFirst() para obtener el primer elemento que coincida con el filtro.
        // Si se encuentra un elemento, se devuelve; de lo contrario, se devuelve null.
        return data.stream().filter(p -> p.getId_product().equals(id)).findFirst().orElse(null);
    }

}
