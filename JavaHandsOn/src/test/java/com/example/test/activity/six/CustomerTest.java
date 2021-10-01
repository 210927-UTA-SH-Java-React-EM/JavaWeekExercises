package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.five.PremiumCustomer;
import com.example.activity.two.ControlFlowActivity;

public class CustomerTest {
	
	//Create tests to test the methods you created and inherited in the PremiumCustomer class from last exercise
	
	PremiumCustomer pcu = new PremiumCustomer();
	
	
	@Test
	public void discountTest() {
		double price =pcu.discount(100);
		assertEquals(85.0, price, .001);
		
	}
	
	
	
}
