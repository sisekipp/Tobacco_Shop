package de.tobaccoshop.model.data.product;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

/**
 * Created by sebastian on 11.07.16.
 */
@Data
public class ProductValue {

    @NonNull
    private Object value;
    @NonNull
    private String type;

    @Builder
    public ProductValue(String type, Object value) {
        this.type = type;
        this.value = value;
    }
}
