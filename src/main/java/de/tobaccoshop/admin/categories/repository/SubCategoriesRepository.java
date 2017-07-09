package de.tobaccoshop.admin.categories.repository;

import de.tobaccoshop.admin.categories.entity.SubCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sebastian on 08.05.16.
 */
public interface SubCategoriesRepository extends MongoRepository<SubCategory,Long> {
}
