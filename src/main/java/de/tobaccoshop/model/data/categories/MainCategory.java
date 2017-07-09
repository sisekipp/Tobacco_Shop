package de.tobaccoshop.model.data.categories;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Tolerate;

/**
 * Created by sebastian on 06.05.16.
 */
@Data
@Builder
public class MainCategory {

    private Long id;

    @NonNull
    private int position;

    @NonNull
    private String name;

    @NonNull
    private String searchMetadata;

    @Tolerate
    public MainCategory(){
    }

}
