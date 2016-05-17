package de.tobaccoshop.model.data.categories;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sebastian on 06.05.16.
 */
@Document(collection = "maincategories")
public class MainCategory extends Category {

    private int position;

    public MainCategory() {

    }

    public MainCategory(String name, int position) {
        super(name);
        this.position = position;
    }



    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
