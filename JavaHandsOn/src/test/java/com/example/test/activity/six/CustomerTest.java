package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.activity.five.PremiumCustomer;

public class CustomerTest {
	
	PremiumCustomer pCustomer;
	PremiumCustomer pCustomer2;
	
	@Before
	public void setup() {
		pCustomer = new PremiumCustomer("Rick", "", 2000, 0);
		pCustomer.AddToCart("CD Paramore", 20);
		pCustomer.AddToCart("Wine Rose", 40);
		pCustomer.AddToCart("Beer", 10);
		pCustomer.AddToCart("Chocolate", 5);
		pCustomer.AddToCart("Apple pie", 7);
	}
	
	@Test
	public void PositiveTest() {
		
		assertEquals("Testing Total",69.7,pCustomer.buy(),0.01);
		
	}
	
	//Create tests to test the methods you created and inherited in the PremiumCustomer class from last exercise
	
}
