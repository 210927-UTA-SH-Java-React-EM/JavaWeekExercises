package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.Test;
import com.example.activity.five.PremiumCustomer;

public class CustomerTest {
	
	//Create tests to test the methods you created and inherited in the 
	//PremiumCustomer class from last exercise

	@Test
	public void testNoArgs() {
		PremiumCustomer c = new PremiumCustomer();
		assertEquals(c.getBalance() > 0, true);
		assertEquals(c.getName().length() > 0, true);
		assertEquals(c.getCartCost() == 0, true);
		assertEquals(c.getCart().equals(""), true);
	}
	
	@Test
	public void testUniqueNumber()
	{
		PremiumCustomer pc1 = new PremiumCustomer();
		PremiumCustomer pc2 = new PremiumCustomer();
		PremiumCustomer pc3 = new PremiumCustomer();
		
		assertNotEquals(pc1.getVipCard(), pc2.getVipCard());
		assertNotEquals(pc1.getVipCard(), pc3.getVipCard());
		assertNotEquals(pc2.getVipCard(), pc3.getVipCard());
		
		assertEquals(pc1.getVipCard() + 1, pc2.getVipCard());
		assertEquals(pc1.getVipCard() + 2, pc3.getVipCard());
		assertEquals(pc2.getVipCard() + 1, pc3.getVipCard());
	}

}
