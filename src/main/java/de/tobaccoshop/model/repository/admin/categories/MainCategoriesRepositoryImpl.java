package de.tobaccoshop.model.repository.admin.categories;

import de.tobaccoshop.model.data.categories.MainCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;

import java.util.List;

/**
 * Created by sebastian on 31.05.16.
 */
public class MainCategoriesRepositoryImpl implements MainCategoriesRepositoryCustom {

    private final MongoTemplate template;

    @Autowired
    public MainCategoriesRepositoryImpl(MongoTemplate template) {
        this.template = template;
    }

    @Override
    public List<MainCategory> searchByName(String name) {
        TextCriteria criteria = TextCriteria.forLanguage("de")
                .matchingAny(name);

        Query query = TextQuery.queryText(criteria)
                .sortByScore();

        List<MainCategory> recipes = template.find(query, MainCategory.class);

        return recipes;
    }
}
