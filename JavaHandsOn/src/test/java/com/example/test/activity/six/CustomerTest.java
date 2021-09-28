package com.example.test.activity.six;

import static org.junit.Assert.*;

import com.example.activity.five.PremiumCustomer;
import org.junit.Test;

public class CustomerTest {

    //Create tests to test the methods you created and inherited in the PremiumCustomer class from last exercise
    public PremiumCustomer premiumCustomer = new PremiumCustomer();

    @Test
    public void discountTest1() {
        premiumCustomer.setCartCost(100);
        assertEquals(75, premiumCustomer.discountPrice(25));
    }

    @Test
    public void discountTest2() {
        premiumCustomer.setCartCost(100);
        assertEquals(85, premiumCustomer.discountPrice(15));
    }

    @Test
    public void discountTest3() {
        premiumCustomer.setCartCost(1000);
        assertEquals(350, premiumCustomer.discountPrice(65));
    }

    @Test
    public void addToCartTest() {
        premiumCustomer.addToCart("Item1", 20);
        assertTrue(premiumCustomer.getCart().get(0).equalsIgnoreCase("Item1"));
        assertEquals(20, premiumCustomer.getCartCost());
    }

    @Test
    public void addToCartTest2() {
        premiumCustomer.addToCart("testItem", 560);
        assertTrue(premiumCustomer.getCart().get(0).equalsIgnoreCase("testItem"));
        assertEquals(560, premiumCustomer.getCartCost());
    }

    @Test
    public void addToCartTest3() {
        premiumCustomer.addToCart("Banana", 5);
        assertTrue(premiumCustomer.getCart().get(0).equalsIgnoreCase("Banana"));
        assertEquals(5, premiumCustomer.getCartCost());
    }

}
