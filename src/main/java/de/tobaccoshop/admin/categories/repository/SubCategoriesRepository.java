package de.tobaccoshop.admin.repository.categories;

import de.tobaccoshop.model.data.categories.SubCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sebastian on 08.05.16.
 */
public interface SubCategoriesRepository extends MongoRepository<SubCategory,Long> {
}