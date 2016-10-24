package de.tobaccoshop;

import de.tobaccoshop.model.data.Address;
import de.tobaccoshop.model.data.Customer;
import de.tobaccoshop.model.data.categories.MainCategory;
import de.tobaccoshop.model.data.categories.SubCategory;
import de.tobaccoshop.model.data.product.MainProduct;
import de.tobaccoshop.model.data.product.ProductValue;
import de.tobaccoshop.model.repository.admin.CustomerRepository;
import de.tobaccoshop.model.repository.admin.categories.MainCategoriesRepository;
import de.tobaccoshop.model.repository.admin.categories.SubCategoriesRepository;
import de.tobaccoshop.model.repository.admin.products.MainProductRepository;
import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.TemplateEngine;

import java.io.Console;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private MainProductRepository mainProductRepository;

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

        MainCategory mainCategoryOne = MainCategory.builder().name("Aktionenprodukte").position(1).searchMetadata("Red Bull, Tabak, Sparangebot, Convent, Winston").build();
        MainCategory mainCategoryTwo = MainCategory.builder().name("E-Zigarette").position(2).searchMetadata("Lynden, Cross, E-Zigarette, Vype, Liquid").build();
        MainCategory mainCategoryThree = MainCategory.builder().name("Zigarren").position(3).searchMetadata("Zigarren,Zigarillo,").build();
        MainCategory mainCategoryFour = MainCategory.builder().name("Dreh- und Stopftabak").position(4).searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        MainCategory mainCategoryFive = MainCategory.builder().name("Pfeifentabak").position(5).searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        MainCategory mainCategorySix = MainCategory.builder().name("Zigaretten").position(6).searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        MainCategory mainCategorySeven = MainCategory.builder().name("Raucherbedarf").position(7).searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();


        mainCategoriesRepository.save(Arrays.asList(mainCategoryOne,mainCategoryTwo,mainCategoryThree,mainCategoryFour,mainCategoryFive,mainCategorySix,mainCategorySeven));

        // Save a couple of sub categories
        subCategoriesRepository.deleteAll();

        // Zigarren
        SubCategory subZ1 = SubCategory.builder().name("Zigarren/Zigarillos A - B").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ2 = SubCategory.builder().name("Zigarren/Zigarillos C - D").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ3 = SubCategory.builder().name("Zigarren/Zigarillos E - F").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ4 = SubCategory.builder().name("Zigarren/Zigarillos G - H").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ5 = SubCategory.builder().name("Zigarren/Zigarillos I - J").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ6 = SubCategory.builder().name("Zigarren/Zigarillos K - L").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ7 = SubCategory.builder().name("Zigarren/Zigarillos M - N").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ8 = SubCategory.builder().name("Zigarren/Zigarillos O - P").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ9 = SubCategory.builder().name("Zigarren/Zigarillos Q - R").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ10 = SubCategory.builder().name("Zigarren/Zigarillos S - T").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ11 = SubCategory.builder().name("Zigarren/Zigarillos U - Z").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZ12 = SubCategory.builder().name("Filterzigarillos").parentCategory("Zigarren").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();

        subCategoriesRepository.save(Arrays.asList(subZ1,subZ2,subZ3,subZ4,subZ5,subZ6,subZ7,subZ8,subZ9,subZ10,subZ11,subZ12));

        // Tabak
        SubCategory subT1 = SubCategory.builder().name("Tabak A - B").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subT2 = SubCategory.builder().name("Tabak C - D").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subT3 = SubCategory.builder().name("Tabak E - F").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subT4 = SubCategory.builder().name("Tabak G - H").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subT5 = SubCategory.builder().name("Tabak I - J").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subT6 = SubCategory.builder().name("Tabak K - L").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subT7 = SubCategory.builder().name("Tabak M - N").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subT8 = SubCategory.builder().name("Tabak O - P").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subT9 = SubCategory.builder().name("Tabak Q - R").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subT10 = SubCategory.builder().name("Tabak S - T").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subT11 = SubCategory.builder().name("Tabak U - Z").parentCategory("Dreh- und Stopftabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();

        subCategoriesRepository.save(Arrays.asList(subT1,subT2,subT3,subT4,subT5,subT6,subT7,subT8,subT9,subT10,subT11));

        // Pfeifentabak
        SubCategory subP1 = SubCategory.builder().name("Tabak A - B").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subP2 = SubCategory.builder().name("Tabak C - D").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subP3 = SubCategory.builder().name("Tabak E - F").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subP4 = SubCategory.builder().name("Tabak G - H").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subP5 = SubCategory.builder().name("Tabak I - J").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subP6 = SubCategory.builder().name("Tabak K - L").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subP7 = SubCategory.builder().name("Tabak M - N").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subP8 = SubCategory.builder().name("Tabak O - P").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subP9 = SubCategory.builder().name("Tabak Q - R").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subP10 = SubCategory.builder().name("Tabak S - T").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subP11 = SubCategory.builder().name("Tabak U - Z").parentCategory("Pfeifentabak").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();

        subCategoriesRepository.save(Arrays.asList(subP1,subP2,subP3,subP4,subP5,subP6,subP7,subP8,subP9,subP10,subP11));

        // Zigaretten
        SubCategory subZG1 = SubCategory.builder().name("Zigaretten A - B").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZG2 = SubCategory.builder().name("Zigaretten C - D").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZG3 = SubCategory.builder().name("Zigaretten E - F").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZG4 = SubCategory.builder().name("Zigaretten G - H").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZG5 = SubCategory.builder().name("Zigaretten I - J").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZG6 = SubCategory.builder().name("Zigaretten K - L").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZG7 = SubCategory.builder().name("Zigaretten M - N").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZG8 = SubCategory.builder().name("Zigaretten O - P").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZG9 = SubCategory.builder().name("Zigaretten Q - R").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZG10 = SubCategory.builder().name("Zigaretten S - T").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subZG11 = SubCategory.builder().name("Zigaretten U - Z").parentCategory("Zigaretten").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();

        subCategoriesRepository.save(Arrays.asList(subZG1,subZG2,subZG3,subZG4,subZG5,subZG6,subZG7,subZG8,subZG9,subZG10,subZG11));

        // Raucherbedarf
        SubCategory subRB1 = SubCategory.builder().name("Hülsen").parentCategory("Raucherbedarf").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subRB2 = SubCategory.builder().name("Papier").parentCategory("Raucherbedarf").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subRB3 = SubCategory.builder().name("Eindrehfilter").parentCategory("Raucherbedarf").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subRB4 = SubCategory.builder().name("Stopfer").parentCategory("Raucherbedarf").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subRB5 = SubCategory.builder().name("Zigarettenwickler").parentCategory("Raucherbedarf").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subRB6 = SubCategory.builder().name("Pfeifenzubehör").parentCategory("Raucherbedarf").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();

        subCategoriesRepository.save(Arrays.asList(subRB1,subRB2,subRB3,subRB4,subRB5,subRB6));

        // E-Zigaretten
        SubCategory subEZ1 = SubCategory.builder().name("Einweg E-Zigarette").parentCategory("E-Zigarette").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subEZ2 = SubCategory.builder().name("Liquids").parentCategory("E-Zigarette").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subEZ3 = SubCategory.builder().name("E-Zigarette").parentCategory("E-Zigarette").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();
        SubCategory subEZ4 = SubCategory.builder().name("Zubehör").parentCategory("E-Zigarette").searchMetadata("preiswert, tabak, stopfen, red bull, marlboro, burton, pall mall, nevada,mohawk").build();

        subCategoriesRepository.save(Arrays.asList(subEZ1,subEZ2,subEZ3,subEZ4));

        /* Main Products */

        mainProductRepository.deleteAll();

        MainProduct mainProductOne = new MainProduct();
        mainProductOne.setName("Test 1");
        mainProductOne.setStock(1);
        Map<String,ProductValue> productValueMapOne = new HashMap<>();
        productValueMapOne.put("Preis", ProductValue.builder().type("Int32").value(2).build());
        mainProductOne.setValues(productValueMapOne);

        MainProduct mainProductTwo = new MainProduct();
        mainProductTwo.setName("Test 2");
        mainProductTwo.setStock(1);
        Map<String,ProductValue> productValueMapTwo = new HashMap<>();
        productValueMapTwo.put("Preis", ProductValue.builder().type("Float").value(20.51).build());
        mainProductTwo.setValues(productValueMapTwo);

        mainProductRepository.save(Arrays.asList(mainProductOne,mainProductTwo));

        List<MainProduct> products = mainProductRepository.findAll();
        products.forEach(p -> p.getValues().forEach((k,v) -> System.out.println(v.getValue().getClass().getTypeName())));

    }
}
