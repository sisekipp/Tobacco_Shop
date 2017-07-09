package de.tobaccoshop.model.data;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;
import org.joda.time.Period;

import java.util.Date;

/**
 * Created by sebastian on 18.04.16.
 */
@Data
@Builder
public class Customer {

    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Address mainAddress;
    private Date birthDate;
    private String phoneNumber;

    @Tolerate
    public Customer() {}

    public boolean isOfAge() {
        Period period = new Period(birthDate.getTime(), new Date().getTime());
        return period.getYears() >= 18;
    }
}
