package de.tobaccoshop.admin.product.repository;

import de.tobaccoshop.admin.product.entity.SpezialProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sebastian on 10.05.16.
 */
public interface SpecialProductRepository extends MongoRepository<SpezialProduct,Long> {
}
