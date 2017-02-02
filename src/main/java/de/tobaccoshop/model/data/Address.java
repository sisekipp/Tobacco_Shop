package de.tobaccoshop.model.data;

import lombok.Data;

import javax.persistence.Embeddable;

/**
 * Created by sebastian on 20.04.16.
 */
@Data
@Embeddable
public class Address {
    private String city;
    private String postalCode;
    private String street;
    private String houseNumber;
}
