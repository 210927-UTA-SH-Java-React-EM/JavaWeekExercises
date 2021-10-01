package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.six.PremiumCustomer;

public class CustomerTest {
	
	PremiumCustomer customer = new PremiumCustomer();

	@Test
	public void testBuy() {
		
		customer.cartCost = 1000.0;
		customer.balance = 1500.0;
		customer.buy();
		assertTrue(850.0 == customer.cartCost);
		assertTrue(650.0 == customer.balance);
		
	}

	@Test
	public void testDiscountPrice() {
		
		customer.cartCost = 1000.0;
		assertTrue(150.0 == customer.discountPrice());
	}

	@Test
	public void testAddToCart() {
		
		assertEquals(customer.addToCart("shirt", 50.0), customer.cart);
		
	}

}
