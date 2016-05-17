package de.tobaccoshop.model.repository.admin.categories;

import de.tobaccoshop.model.data.categories.SubCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by sebastian on 08.05.16.
 */
@EnableMongoRepositories()
public interface SubCategoriesRepository extends MongoRepository<SubCategory,String> {
}
