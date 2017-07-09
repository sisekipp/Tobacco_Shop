package de.tobaccoshop.model.repository.admin.products;

import de.tobaccoshop.model.data.product.SpezialProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sebastian on 10.05.16.
 */
public interface SpecialProductRepository extends MongoRepository<SpezialProduct,Long> {
}
