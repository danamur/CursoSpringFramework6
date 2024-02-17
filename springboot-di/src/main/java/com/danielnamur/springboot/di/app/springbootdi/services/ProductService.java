package com.danielnamur.springboot.di.app.springbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import com.danielnamur.springboot.di.app.springbootdi.models.Product;
import com.danielnamur.springboot.di.app.springbootdi.repositories.ProductRepository;

public class ProductService {

    private ProductRepository repository = new ProductRepository();

     /**
     * Retorna una lista de todos los productos con precios convertidos.
     * Utiliza el método findAll() del repositorio para obtener todos los productos.
     * Luego, utiliza un stream para procesar cada producto y ajustar su precio.
     * Se aplica un impuesto del 19% al precio de cada producto.
     * Los precios ajustados se convierten a Long y se actualizan en cada producto.
     * Finalmente, se coleccionan todos los productos ajustados en una lista y se devuelve.
     * @return Una lista de todos los productos con precios convertidos.
     */
    public List<Product> findAll() {
        return repository.findAll().stream().map(p ->{
            Double priceImp = p.getPrice() * 1.19;
            // Clona el producto actual y actualiza su precio con el precio con impuesto.
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceImp.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }

}
