package com.example.test.activity.five;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.five.PremiumCustomer;
import com.example.activity.four.FunWithArrays;



public class PremiumCustomerTest {

	
public PremiumCustomer pc = new PremiumCustomer("JAck", 500, "", 10, 6569, 5);
	
	@Test
	public void discountPriceTest() {
	int x =	pc.discountPrice(100);
	assertEquals(85, x);

	    
	}
	
	
}
