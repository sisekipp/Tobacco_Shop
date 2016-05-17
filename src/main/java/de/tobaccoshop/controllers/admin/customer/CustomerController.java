package de.tobaccoshop.controllers.admin.customer;

import de.tobaccoshop.controllers.admin.exceptions.CustomerNotFoundException;
import de.tobaccoshop.model.data.Customer;
import de.tobaccoshop.model.repository.admin.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
        List<Customer> customers = customerRepository.findAll();

        model.addAttribute("customers", customers);
        return "/admin/customers/main";
    }

    @RequestMapping("/details")
    public String info(@RequestParam(value="id", required = true)String id, Model model) {
        Customer customer = customerRepository.findOne(id);

        if (customer == null) throw new CustomerNotFoundException();

        model.addAttribute("customer", customer);
        return "/admin/customers/details";
    }
}
