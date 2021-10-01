package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import com.example.activity.five.PremiumCustomer;
import com.example.activity.five.Customer;

public class CustomerTest {
	
	//Create tests to test the methods you created and inherited in the PremiumCustomer class from last exercise
	
	@Test
	public void testDiscountPrice() {
		PremiumCustomer a = new PremiumCustomer();
		assertEquals(-15,a.discountPrice(100),0);
	}
	
	@Test
	public void testAddToCart() {
		PremiumCustomer b = new PremiumCustomer("Taylor",50.00,"",0.00,4247,2);
		assertEquals("Chocolate", b.addToCartItem("Chocolate"));
	}
}