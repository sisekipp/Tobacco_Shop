package de.tobaccoshop.model.data;

import de.tobaccoshop.admin.product.entity.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sebastian on 22.04.16.
 */
public class ProductsTests {

    private Product testee;

    @Before
    public void SetUp() {
        this.testee = new Product();
    }

    @After
    public void tearDown() {
        this.testee = null;
    }

    @Test
    public void checkisInStockForStockIsEmpty() {
        testee.setStock(0);

        Assert.assertFalse(testee. isInStock());
    }

    @Test
    public void checkisInStockForStockIsFull() {
        testee.setStock(1);

        Assert.assertTrue(testee.isInStock());
    }
}
