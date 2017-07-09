package de.tobaccoshop.admin.product.entity;

import lombok.Data;

/**
 * Created by sebastian on 22.04.16.
 */
@Data
public class Product {

    private Long Id;
    private String name;
    private int stock;
    //@ManyToMany(cascade = CascadeType.ALL)
    //private Map<String,ProductValue> values;

    public boolean isInStock() {
        return stock > 0;
    }
}
