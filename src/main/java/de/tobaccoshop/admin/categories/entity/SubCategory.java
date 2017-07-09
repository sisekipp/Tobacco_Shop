package de.tobaccoshop.admin.categories.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Tolerate;

/**
 * Created by sebastian on 08.05.16.
 */
@Data
@Builder
public class SubCategory {

    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String searchMetadata;

    @NonNull
    private String parentCategory;

    @Tolerate
    public SubCategory() {}
}
