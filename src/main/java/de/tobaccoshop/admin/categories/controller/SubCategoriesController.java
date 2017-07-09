package de.tobaccoshop.admin.categories.controller;

import de.tobaccoshop.admin.categories.entity.SubCategory;
import de.tobaccoshop.admin.categories.repository.SubCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by sebastian on 08.05.16.
 */
@Controller
@RequestMapping("/admin/subcategories")
public class SubCategoriesController {

    private SubCategoriesRepository subCategoriesRepository;

    @Autowired
    public SubCategoriesController(SubCategoriesRepository subCategoriesRepository) {
        this.subCategoriesRepository = subCategoriesRepository;
    }

    @RequestMapping("")
    public String index(Model model) {
        List<SubCategory> subCategories = subCategoriesRepository.findAll();

        model.addAttribute("subcategories", subCategories);

        return "/admin/categories/sub/index";
    }
}
