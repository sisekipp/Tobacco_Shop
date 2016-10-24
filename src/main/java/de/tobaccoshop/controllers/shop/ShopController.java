package de.tobaccoshop.controllers.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sebastian on 17.08.16.
 */
@Controller
@RequestMapping("/shop")
public class ShopController {
    @RequestMapping("")
    public String index(Model model) {
        return "/shop/main";
    }
}