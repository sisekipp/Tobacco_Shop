package de.tobaccoshop.model.data.product;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sebastian on 08.05.16.
 * Aktion Produkte
 */
@Document(collection = "spezialproducts")
public class SpezialProduct extends Product  {
}
