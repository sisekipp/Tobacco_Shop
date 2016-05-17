package de.tobaccoshop.model.data;

import junit.framework.Assert;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sebastian on 22.04.16.
 */
public class CustomerTests {

    private Customer testee;

    @Before
    public void setUp() {
        this.testee = new Customer();
    }

    @After
    public void tearDown() {
        this.testee = null;
    }

    @Test
    public void checkisOfAgeForUnderEighteen() {
        testee.setBirthDate(DateTime.parse("08.12.2004", DateTimeFormat.forPattern("dd.mm.yyyy")).toDate());

        Assert.assertFalse(testee.isOfAge());
    }

    @Test
    public void checkisOfAgeForIsEighteen() {
        testee.setBirthDate(DateTime.now().minusYears(18).toDate());

        Assert.assertTrue(testee.isOfAge());
    }

    @Test
    public void checkisOfAgeForOverEighteen() {
        testee.setBirthDate(DateTime.parse("08.12.1983",DateTimeFormat.forPattern("dd.mm.yyyy")).toDate());

        Assert.assertTrue(testee.isOfAge());
    }
}
