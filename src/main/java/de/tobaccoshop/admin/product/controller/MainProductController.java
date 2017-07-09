package de.tobaccoshop.admin.controllers.product;

import de.tobaccoshop.admin.repository.products.MainProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sebastian on 25.04.16.
 */
@Controller
@RequestMapping("/admin/mainproducts")
public class MainProductController {

    private MainProductRepository productRepository;

    @Autowired
    public MainProductController(MainProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("")
    public String index(Model model) {
        return "/admin/products/main/index";
    }
}
