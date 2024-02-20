package com.danielnamur.springboot.di.app.springbootdi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.danielnamur.springboot.di.app.springbootdi.models.Product;
import com.danielnamur.springboot.di.app.springbootdi.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private Environment environment;

    /**
     * Inyección de dependencia utilizando @Autowired y @Qualifier.
     * El atributo 'repository' se inyecta utilizando la anotación @Autowired,
     * que busca automáticamente un bean que implemente la interfaz ProductRepository.
     * La anotación @Qualifier se utiliza para especificar el nombre del bean
     * que se debe utilizar cuando hay más de una implementación de ProductRepository disponible.
     * @Autowired
     * @Qualifier("productFoo")
    */
    private ProductRepository repository;

    /**
     * Constructor de ProductServiceImpl que recibe una implementación de ProductRepository.
     * Utiliza la anotación @Qualifier para especificar el nombre del bean
     * que se debe utilizar cuando hay más de una implementación de ProductRepository disponible.
     * Esta implementación proporciona una forma explícita de inyección de dependencia
     * utilizando el constructor de la clase.
     * @param repository La implementación de ProductRepository que se utilizará.
    */
    public ProductServiceImpl(@Qualifier("productJson") ProductRepository repository) {
        this.repository = repository;
    }

    /**
     * Retorna una lista de todos los productos con precios convertidos.
     * Utiliza el método findAll() del repositorio para obtener todos los productos.
     * Luego, utiliza un stream para procesar cada producto y ajustar su precio.
     * Se aplica un impuesto del 19% al precio de cada producto.
     * Los precios ajustados se convierten a Long y se actualizan en cada producto.
     * Finalmente, se coleccionan todos los productos ajustados en una lista y se devuelve.
     * @return Una lista de todos los productos con precios convertidos.
    */
    @Override
    public List<Product> findAll() {
        return repository.findAll().stream().map(p ->{
            Double priceImp = p.getPrice() * environment.getProperty("config.price.tax", Double.class);
            // Clona el producto actual y actualiza su precio con el precio con impuesto.
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceImp.longValue());
            return newProduct;
            // p.setPrice(priceImp.longValue());
            // return p;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return repository.findById(id);
    }

}
