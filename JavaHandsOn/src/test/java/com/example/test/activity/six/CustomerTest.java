package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.five.PremiumCustomer;

public class CustomerTest {
	
	//Create tests to test the methods you created and inherited in the PremiumCustomer class from last exercise
	public PremiumCustomer premiumCustomer = new PremiumCustomer("Donna Rismay", 2500, "", 0, 732645, 2);
	
	@Test
	public void testingAddToCart() {
		premiumCustomer.addToCart("Camera", 200.0);
		assertEquals("Camera", premiumCustomer.getCart());
		assertEquals(200.0, premiumCustomer.getCartCost());
	}
	
	@Test
	public void testingDiscountPrice() {
		premiumCustomer.addToCart("MP3 PLayer", 89.0);
		assertEquals(75.65, premiumCustomer.discountPrice(premiumCustomer.getCartCost()));
	}
	
	@Test
	public void testingBuyMethod() {
		premiumCustomer.addToCart("Bicycle", 150.0);
		premiumCustomer.buy();
		assertEquals(2372.5, premiumCustomer.getBalance());
	}
}
