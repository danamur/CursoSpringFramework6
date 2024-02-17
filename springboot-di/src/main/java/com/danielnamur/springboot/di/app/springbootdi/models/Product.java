package com.danielnamur.springboot.di.app.springbootdi.models;

public class Product implements Cloneable {

    private Long id_product;
    private String name;
    private Long price;

    public Product() {
    }

    public Product(Long id_product, String name, Long price) {
        this.id_product = id_product;
        this.name = name;
        this.price = price;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }
    
    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();   
        } catch (CloneNotSupportedException e) {
            return new Product(id_product, name,price);
        }
    }

}
