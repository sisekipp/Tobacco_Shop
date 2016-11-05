package de.tobaccoshop.model.data;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;
import org.joda.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by sebastian on 18.04.16.
 */
@Data
@Builder
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
