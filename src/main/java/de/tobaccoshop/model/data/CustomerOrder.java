package de.tobaccoshop.model.data;



import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by sebastian on 22.04.16.
 */
@Data
@Entity
@Builder
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private Date orderDate;

    @Tolerate
    public CustomerOrder() {}
}
