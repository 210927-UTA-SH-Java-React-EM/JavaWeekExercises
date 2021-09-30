package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.five.PremiumCustomer;

public class CustomerTest {
	
	//Create tests to test the methods you created and inherited in the PremiumCustomer class from last exercise

	public PremiumCustomer premCustomer = new PremiumCustomer("Suzie Q", 1000, "", 0, 156735, 1);
	
	@Test
	public void addToCartTest1() {
		premCustomer.addToCart("Milk", 2);
		assertEquals("Milk ", premCustomer.getCart());
		assertEquals(2, premCustomer.getCartCost());
	}
	
	@Test
	public void addToCartTest2() {
		premCustomer.addToCart("Eggs", 1);
		assertEquals("Eggs ", premCustomer.getCart());
		assertEquals(1, premCustomer.getCartCost());
	}
	
	@Test
	public void discountPriceTest1() {
		premCustomer.addToCart("Flowers", 10);
		assertEquals(8, premCustomer.discountPrice(premCustomer.getCartCost()));
	}
	
	@Test
	public void discountPriceTest2() {
		premCustomer.addToCart("TwentyDollarObj", 20);
		assertNotEquals(16, premCustomer.discountPrice(premCustomer.getCartCost()));
	}
	
	@Test
	public void buyTest1() {
		premCustomer.addToCart("OneHundredDollarObj", 100);
		premCustomer.buy();
		assertEquals(915, premCustomer.getBalance());
	}
	
	@Test
	public void buyTest2() {
		premCustomer.addToCart("FiftyDollarObj", 50);
		premCustomer.buy();
		assertEquals(958, premCustomer.getBalance());
	}
	
}
