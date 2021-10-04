package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.example.activity.five.PremiumCustomer;

public class CustomerTest {
	
	static PremiumCustomer pc;
	
	//Create tests to test the methods you created and inherited in the PremiumCustomer class from last exercise
	@BeforeClass
	public static void setupBeforeClass() throws Exception {
		//System.out.println("This runs before any test once");
		pc = new PremiumCustomer();
		pc.setYears(2);
	}
	
	@Test
	public void discountTest() {
		//assertEquals(String message, exepected, actual)
		assertEquals("Testing discount", 85, pc.discountPrice(100));
	}
	
	@Test
	public void getterTest() {
		//assertEquals(String message, exepected, actual)
		assertEquals("Testing getter", 2, pc.getYears());
	}
	
	
	
}
