package de.tobaccoshop.model.repository.admin.categories;

import de.tobaccoshop.model.data.categories.MainCategory;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by sebastian on 31.05.16.
 */
public interface MainCategoriesRepositoryCustom {
    public List<MainCategory> searchByName(String name);
}
