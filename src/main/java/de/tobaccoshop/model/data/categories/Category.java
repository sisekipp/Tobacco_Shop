package de.tobaccoshop.model.data.categories;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;

/**
 * Created by sebastian on 08.05.16.
 */
public class Category {

    @Id
    private String id;
    @TextIndexed
    private String name;

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
