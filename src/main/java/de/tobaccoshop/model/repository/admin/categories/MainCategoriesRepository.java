package de.tobaccoshop.model.repository.admin.categories;

import de.tobaccoshop.model.data.categories.MainCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by sebastian on 07.05.16.
 */
@EnableMongoRepositories()
public interface MainCategoriesRepository extends MongoRepository<MainCategory,String> {
}
