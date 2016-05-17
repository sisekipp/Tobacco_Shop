package de.tobaccoshop.model.repository.admin;

import de.tobaccoshop.model.data.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

/**
 * Created by sebastian on 18.04.16.
 */
@EnableMongoRepositories()
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);
}
