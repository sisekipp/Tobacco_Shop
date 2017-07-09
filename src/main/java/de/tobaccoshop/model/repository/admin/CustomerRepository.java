package de.tobaccoshop.model.repository.admin;

import de.tobaccoshop.model.data.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by sebastian on 18.04.16.
 */
public interface CustomerRepository extends MongoRepository<Customer, Long> {

    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);
}
