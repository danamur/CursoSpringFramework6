package com.danielnamur.springboot.di.factura.springbootdifactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Invoice {

    @Autowired
    private Client client;
    
    @Value("${invoice.description}")
    private String description;
    
    @Autowired
    @Qualifier("default")
    private List<Item> items;

    @PostConstruct
    private void init() {
        System.out.println("Creando el componente de la factura");
        client.setName(client.getName().concat(" Gambito"));
        description = description.concat(" del cliente: ").concat(client.getName()).concat(" ").concat(client.getLastname());
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal() {
        // int total = 0;
        // for (Item item : items) {
        //     total += item.getImport();
        // }
        int total = items.stream().map(item -> item.getImport()).reduce(0, (sum, importe) -> sum + importe);

        return total;
    }

}