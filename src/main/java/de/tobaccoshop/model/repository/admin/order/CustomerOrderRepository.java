package de.tobaccoshop.model.repository.admin.order;

import de.tobaccoshop.model.data.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sebastian on 04.11.16.
 */
public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Long> {
}
