package de.tobaccoshop;

import de.tobaccoshop.model.data.Address;
import de.tobaccoshop.model.data.Customer;
import de.tobaccoshop.model.data.categories.MainCategory;
import de.tobaccoshop.model.data.categories.SubCategory;
import de.tobaccoshop.model.repository.admin.CustomerRepository;
import de.tobaccoshop.model.repository.admin.categories.MainCategoriesRepository;
import de.tobaccoshop.model.repository.admin.categories.SubCategoriesRepository;
import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.TemplateEngine;

import java.util.Arrays;

/**
 * Created by sebastian on 18.04.16.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private MainCategoriesRepository mainCategoriesRepository;

    @Autowired
    private SubCategoriesRepository subCategoriesRepository;

    public static void main(String[] args) {

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.addDialect(new LayoutDialect());

        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        customerRepository.deleteAll();

        Address addressOne = new Address();
        addressOne.setCity("Kandern");
        addressOne.setStreet("Am Bach");
        addressOne.setHouseNumber("10");
        addressOne.setPostalCode("79400");

        Address addressTwo = new Address();
        addressTwo.setCity("Borna");
        addressTwo.setStreet("Am Wehr");
        addressTwo.setHouseNumber("10");
        addressTwo.setPostalCode("04552");

        Customer customerOne = new Customer("Sebastian", "Kipping", DateTime.parse("08.12.1983", DateTimeFormat.forPattern("dd.mm.yyyy")).toDate());
        customerOne.setEmail("kipping.sebastian@gmail.com");
        customerOne.setMainAddress(addressOne);

        Customer customerTwo = new Customer("Katrin", "Kipping-Jehle",DateTime.parse("29.03.1982", DateTimeFormat.forPattern("dd.mm.yyyy")).toDate());
        customerTwo.setEmail("familie.jehle@aol.com");
        customerTwo.setMainAddress(addressOne);

        Customer customerThree = new Customer("Carina", "Jehle", DateTime.parse("10.05.2005", DateTimeFormat.forPattern("dd.mm.yyyy")).toDate());
        customerThree.setEmail("carina.jehle@gmail.com");
        customerThree.setMainAddress(addressOne);

        Customer customerFour = new Customer("Till", "Jehle", DateTime.parse("20.06.2008", DateTimeFormat.forPattern("dd.mm.yyyy")).toDate());
        customerFour.setEmail("till.jehle@gmail.com");
        customerFour.setMainAddress(addressOne);

        // save a couple of customers
        customerRepository.save(customerOne);
        customerRepository.save(customerTwo);
        customerRepository.save(customerThree);
        customerRepository.save(customerFour);

        // Save a couple of main categories
        mainCategoriesRepository.deleteAll();

        MainCategory mainCategoryOne = new MainCategory("Aktionenprodukte", 1);
        MainCategory mainCategoryTwo = new MainCategory("E-Zigarette", 2);
        MainCategory mainCategoryThree = new MainCategory("Zigarren", 3);
        MainCategory mainCategoryFour = new MainCategory("Dreh- und Stopftabak", 4);
        MainCategory mainCategoryFive = new MainCategory("Pfeifentabak", 5);
        MainCategory mainCategorySix = new MainCategory("Zigaretten", 6);
        MainCategory mainCategorySeven = new MainCategory("Raucherbedarf", 7);

        mainCategoriesRepository.save(Arrays.asList(mainCategoryOne, mainCategoryTwo, mainCategoryThree, mainCategoryFour, mainCategoryFive, mainCategorySix, mainCategorySeven));

        // Save a couple of sub categories
        subCategoriesRepository.deleteAll();

        SubCategory subCategoryOne = new SubCategory("Tabak A - B");
        SubCategory subCategoryTwo = new SubCategory("Tabak C - D");
        SubCategory subCategoryThree = new SubCategory("Tabak E - F");

        subCategoriesRepository.save(Arrays.asList(subCategoryOne,subCategoryTwo,subCategoryThree));

    }
}
