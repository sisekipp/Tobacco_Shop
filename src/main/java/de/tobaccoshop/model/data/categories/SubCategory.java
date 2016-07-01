package de.tobaccoshop.model.data.categories;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sebastian on 08.05.16.
 */
@Document(collection = "subcategories")
@Data
public class SubCategory extends Category {

    @NonNull
    private String parentCategory;

    @Builder
    public SubCategory(String name, String parentCategory, String searchMetadata) {
        super(name,searchMetadata);
        this.parentCategory = parentCategory;
    }
}
