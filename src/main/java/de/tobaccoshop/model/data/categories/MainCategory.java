package de.tobaccoshop.model.data.categories;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sebastian on 06.05.16.
 */
@Data
@Entity
@Builder
public class MainCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
