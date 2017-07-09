package de.tobaccoshop.model.data;

import lombok.Data;

/**
 * Created by sebastian on 20.04.16.
 */
@Data
public class Address {
    private String city;
    private String postalCode;
    private String street;
    private String houseNumber;
}
