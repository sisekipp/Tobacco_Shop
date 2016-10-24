package de.tobaccoshop.model.data.product;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Map;

/**
 * Created by sebastian on 22.04.16.
 */
@Data
public class Product {

    @Id
    private String Id;
    private String name;
    private int stock;
    private Map<String,ProductValue> values;

    public boolean isInStock() {
        return stock > 0;
    }
}
