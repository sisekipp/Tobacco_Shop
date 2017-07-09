package de.tobaccoshop.admin.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sebastian on 25.04.16.
 */
@Controller
@RequestMapping("/admin/orders")
public class OrderController {

    @RequestMapping("")
    public String index(Model model) {
        return "/admin/orders/main";
    }

    @RequestMapping("/details")
    public String details(Model model) {
        return "/admin/orders/main";
    }


}
