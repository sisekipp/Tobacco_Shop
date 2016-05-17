package de.tobaccoshop.model.data.categories;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sebastian on 08.05.16.
 */
@Document(collection = "subcategories")
public class SubCategory extends Category {

    public SubCategory() {

    }

    public SubCategory(String name) {
        super(name);
    }
}
