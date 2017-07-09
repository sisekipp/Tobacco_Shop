package de.tobaccoshop.admin.order.entity;



import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.util.Date;

/**
 * Created by sebastian on 22.04.16.
 */
@Data
@Builder
public class CustomerOrder {

    private Long Id;

    private Date orderDate;

    @Tolerate
    public CustomerOrder() {}
}
