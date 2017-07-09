package de.tobaccoshop.admin.product.repository;

import de.tobaccoshop.admin.product.entity.MainProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sebastian on 10.05.16.
 */
public interface MainProductRepository extends MongoRepository<MainProduct,Long> {
}
