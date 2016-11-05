package de.tobaccoshop.model.data.product;

import lombok.Data;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by sebastian on 22.04.16.
 */
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private int stock;
    //@ManyToMany(cascade = CascadeType.ALL)
    //private Map<String,ProductValue> values;

    public boolean isInStock() {
        return stock > 0;
    }
}
