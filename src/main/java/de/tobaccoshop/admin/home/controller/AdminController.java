package de.tobaccoshop.admin.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sebastian on 18.04.16.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("")
    public String index(Model model) {
        return "/admin/main";
    }
}
