package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.activity.five.PremiumCustomer;


public class CustomerTest {
	
	static PremiumCustomer premiumBoss;
	
	@BeforeClass
	public static void setupBeforeClass() throws Exception{
		System.out.println("This runs before any test once.");
		premiumBoss = new PremiumCustomer();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("This runs after the entire test class is finished.");
	}
	
	//Create tests to test the methods you created and inherited in the PremiumCustomer class from last exercise
	
	@Test
	public void addToCartTest() {
		//assertEquals(String message,expected, actual)
		assertEquals( "ButterScotch Statue", premiumBoss.addToCart("ButterScotch Statue", 1200));
	}
	
	@Test
	public void disountPriceTest() {
		//assertEquals(String message,expected, actual)
		assertEquals( 1020, premiumBoss.discountPrice(1200));
	}
	
	public void buyTest() {
		//assertEquals(String message,expected, actual)
		assertEquals( 1020, premiumBoss.discountPrice(1200));
	}

}
