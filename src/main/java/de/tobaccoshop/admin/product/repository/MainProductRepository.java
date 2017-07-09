package de.tobaccoshop.admin.repository.products;

import de.tobaccoshop.model.data.product.MainProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sebastian on 10.05.16.
 */
public interface MainProductRepository extends MongoRepository<MainProduct,Long> {
}
