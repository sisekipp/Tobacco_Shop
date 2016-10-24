package de.tobaccoshop.model.data.product;

import de.tobaccoshop.model.data.product.Product;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sebastian on 08.05.16.
 */
@Document(collection = "mainproducts")
public class MainProduct extends Product {
}
