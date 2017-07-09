package de.tobaccoshop.admin.customer.controller;

import de.tobaccoshop.admin.customer.exceptions.CustomerNotFoundException;
import de.tobaccoshop.admin.customer.entity.Customer;
import de.tobaccoshop.admin.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by sebastian on 25.04.16.
 */
@Controller
@RequestMapping("/admin/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping("")
    public String index(Model model) {
        Iterable<Customer> customers = customerRepository.findAll();

        model.addAttribute("customers", customers);
        return "/admin/customers/main";
    }

    @RequestMapping("/details")
    public String info(@RequestParam(value="id", required = true)Long id, Model model) {
        Customer customer = customerRepository.findOne(id);

        if (customer == null) throw new CustomerNotFoundException();

        model.addAttribute("customer", customer);
        return "/admin/customers/details";
    }
}
