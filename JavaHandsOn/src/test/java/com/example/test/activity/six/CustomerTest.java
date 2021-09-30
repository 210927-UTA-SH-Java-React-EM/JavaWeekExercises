package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.activity.five.PremiumCustomer;

public class CustomerTest {
	
	private static PremiumCustomer pc;
	
	@Before
	public void setup() {
		pc = new PremiumCustomer("Bob Dylan", 100, "Bananas", 1, 123, 2);
	}
	
	@Test
	public void NoArgConstructor() {
		PremiumCustomer emptyPC = new PremiumCustomer();
		assertEquals(emptyPC.getBalance(), 0 , 0.01);
		assertEquals(emptyPC.getCartCost(), 0);
		assertTrue(emptyPC.getName().equals(""));
		assertEquals(emptyPC.getVipCard(), 0);
		assertEquals(emptyPC.getYears(), 0);
		assertEquals(emptyPC.getCart(), "");
	}
	
	@Test
	public void AllArgConstructor() {
		assertEquals(pc.getBalance(), 100 , 0.01);
		assertEquals(pc.getCartCost(), 1);
		assertTrue(pc.getName().equals("Bob Dylan"));
		assertEquals(pc.getVipCard(), 123);
		assertEquals(pc.getYears(), 2);
		assertEquals(pc.getCart(), "Bananas");
	}
	
	@Test
	public void BuyTest() {
		// Successful purchase
		assertEquals(pc.getBalance(), 100 , 0.01);
		String cart = pc.addToCart("Papaya", 5);
		assertEquals(cart, "Bananas,Papaya");
		cart = pc.addToCart("Frosted Flakes", 3);
		assertEquals(cart, "Bananas,Papaya,Frosted Flakes");
		assertEquals(pc.getCartCost(), 9);
		pc.buy();
		assertEquals(pc.getCart(), "");
		assertEquals(pc.getCartCost(), 0);
		assertEquals(pc.getBalance(), 93, .01);
		
		// Unsuccessful purchase
		cart = pc.addToCart("TV", 200);
		assertEquals(pc.getCart(), "TV");
		pc.buy();
		assertEquals(pc.getBalance(), 93, .01);
		assertEquals(pc.getCart(), "TV");
		assertEquals(pc.getCartCost(), 200);
	}
	
	@Test
	public void SetterTest() {
		// Name getter/setter
		assertEquals(pc.getName(), "Bob Dylan");
		pc.setName("Jack Skellington");
		assertEquals(pc.getName(), "Jack Skellington");
		
		// Balance getter/setter
		assertEquals(pc.getBalance(), 100, 0.01);
		pc.setBalance(150);
		assertEquals(pc.getBalance(), 150, 0.01);
		
		// VIP card getter/setter
		assertEquals(pc.getVipCard(), 123);
		pc.setVipCard(456);
		assertEquals(pc.getVipCard(), 456);
		
		// Years getter/setter
		assertEquals(pc.getYears(), 2);
		pc.setYears(5);
		assertEquals(pc.getYears(), 5);
	}
	
	@Test
	public void DiscountTest() {
		assertEquals(pc.discountPrice(100), 85);
	}

}