package de.tobaccoshop.model.repository.admin.order;

import de.tobaccoshop.model.data.CustomerOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sebastian on 04.11.16.
 */
public interface CustomerOrderRepository extends MongoRepository<CustomerOrder, Long> {
}
