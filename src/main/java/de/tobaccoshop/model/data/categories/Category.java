package de.tobaccoshop.model.data.categories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;

import javax.validation.constraints.NotNull;

/**
 * Created by sebastian on 08.05.16.
 */
@RequiredArgsConstructor
@Data
public class Category {
    @Id
    private String id;
    @TextIndexed
    @NonNull
    private String name;

    @NonNull
    private String searchMetadata;
}
