package de.tobaccoshop.model.data.product;

import org.springframework.data.annotation.Id;

/**
 * Created by sebastian on 22.04.16.
 */
public class Product {

    @Id
    private String Id;
    private String name;
    private int stock;

    public Product() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isInStock() {
        return stock > 0;
    }
}
