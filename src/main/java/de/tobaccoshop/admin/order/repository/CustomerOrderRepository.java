package de.tobaccoshop.admin.order.repository;

import de.tobaccoshop.admin.order.entity.CustomerOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sebastian on 04.11.16.
 */
public interface CustomerOrderRepository extends MongoRepository<CustomerOrder, Long> {
}
