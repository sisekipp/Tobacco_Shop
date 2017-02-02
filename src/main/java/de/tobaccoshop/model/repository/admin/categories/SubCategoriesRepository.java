package de.tobaccoshop.model.repository.admin.categories;

import de.tobaccoshop.model.data.categories.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sebastian on 08.05.16.
 */
public interface SubCategoriesRepository extends JpaRepository<SubCategory,Long> {
}
