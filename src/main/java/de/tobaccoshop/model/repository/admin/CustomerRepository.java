package de.tobaccoshop.model.repository.admin;

import de.tobaccoshop.model.data.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by sebastian on 18.04.16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);
}
