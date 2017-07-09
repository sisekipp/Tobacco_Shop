package de.tobaccoshop.admin.product.controller;

import de.tobaccoshop.admin.product.repository.SpecialProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sebastian on 10.05.16.
 */
@Controller
@RequestMapping("/admin/specialproducts")
public class SpecialProductController {

    private SpecialProductRepository productRepository;

    @Autowired
    public SpecialProductController(SpecialProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("")
    public String index(Model model) {
        return "/admin/products/special/index";
    }
}
