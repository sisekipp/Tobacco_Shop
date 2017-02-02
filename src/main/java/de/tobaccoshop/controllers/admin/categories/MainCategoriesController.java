package de.tobaccoshop.controllers.admin.categories;

import de.tobaccoshop.model.data.categories.MainCategory;
import de.tobaccoshop.model.repository.admin.categories.MainCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.OptionalInt;

/**
 * Created by sebastian on 08.05.16.
 */
@Controller
@RequestMapping("/admin/maincategories")
public class MainCategoriesController {

    private MainCategoriesRepository mainCategoriesRepository;

    @Autowired
    public MainCategoriesController(MainCategoriesRepository mainCategoriesRepository) {
        this.mainCategoriesRepository = mainCategoriesRepository;
    }


    @RequestMapping("")
    public String index(Model model) {
        List<MainCategory> mainCategories = mainCategoriesRepository.findAll();

        model.addAttribute("title", "Hauptkategorien");
        model.addAttribute("maincategories", mainCategories);

        return "admin/categories/main/index";
    }

    @RequestMapping("/search")
    public String search(@RequestParam("query") String query,Model model) {
        if (query.isEmpty()) {
            return "redirect:admin/maincategories";
        }
        else {
            List<MainCategory> mainCategories = mainCategoriesRepository.findAll();
            model.addAttribute("title", "Hauptkategorien");
            model.addAttribute("maincategories", mainCategories);

            return "admin/categories/main/index";
        }

    }

    @RequestMapping("/add")
    public String add(@RequestParam("name") String name,@RequestParam("searchMetaData") String searchMetaData, Model model) {
        List<MainCategory> mainCategories = mainCategoriesRepository.findAll();

        OptionalInt maxPosition = mainCategories.stream().mapToInt(p -> p.getPosition()).max();

        if(maxPosition.isPresent()) {
            MainCategory newMainCategory = MainCategory.builder().name(name).position(maxPosition.getAsInt() +1).searchMetadata(searchMetaData).build();
            mainCategoriesRepository.save(newMainCategory);
        }

        return "redirect:admin/maincategories";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("id") Long id, Model model) {
        mainCategoriesRepository.delete(id);

        return "redirect:admin/maincategories";
    }

}
