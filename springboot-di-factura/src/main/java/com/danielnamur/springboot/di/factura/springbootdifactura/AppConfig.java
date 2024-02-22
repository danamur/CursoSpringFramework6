package com.danielnamur.springboot.di.factura.springbootdifactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.danielnamur.springboot.di.factura.springbootdifactura.models.Item;
import com.danielnamur.springboot.di.factura.springbootdifactura.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    List<Item> itemsInvoice() {
        Product product1 = new Product("Laptop Ultrabook Acer Swift 5", 1299999);
        Product product2 = new Product("Smartphone Samsung Galaxy S22 Ultra", 1599999);
        Product product3 = new Product("Tablet Apple iPad Air 2022", 799999);
        Product product4 = new Product("Smartwatch Garmin Fenix 7X", 149999);
        Product product5 = new Product("Cámara Mirrorless Sony Alpha A7 IV", 2599999);
        List<Item> items = Arrays.asList(
            new Item(product1, 3),
            new Item(product2, 5),
            new Item(product3, 1),
            new Item(product4, 10),
            new Item(product5, 2)
        );

        return items;
    }

}