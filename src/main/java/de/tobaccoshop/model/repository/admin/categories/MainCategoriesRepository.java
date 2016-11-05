package de.tobaccoshop.model.repository.admin.categories;

import de.tobaccoshop.model.data.categories.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sebastian on 07.05.16.
 */
public interface MainCategoriesRepository extends JpaRepository<MainCategory,Long> {

}
