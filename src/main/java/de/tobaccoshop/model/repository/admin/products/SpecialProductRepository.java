package de.tobaccoshop.model.repository.admin.products;

import de.tobaccoshop.model.data.product.SpezialProduct;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sebastian on 10.05.16.
 */
public interface SpecialProductRepository extends JpaRepository<SpezialProduct,Long> {
}
