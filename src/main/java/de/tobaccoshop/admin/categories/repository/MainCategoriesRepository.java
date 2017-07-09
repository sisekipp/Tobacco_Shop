package de.tobaccoshop.admin.categories.repository;

import de.tobaccoshop.admin.categories.entity.MainCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sebastian on 07.05.16.
 */
public interface MainCategoriesRepository extends MongoRepository<MainCategory,Long> {

}
