package de.tobaccoshop.model.data.categories;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sebastian on 06.05.16.
 */
@Document(collection = "maincategories")
@Data
public class MainCategory extends Category {

    @NonNull
    private int position;

    @Builder
    public MainCategory(String name, int position, String searchMetadata) {
        super(name,searchMetadata);
        this.position = position;
    }
}
