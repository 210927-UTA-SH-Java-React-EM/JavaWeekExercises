package com.example.test.activity.six;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.five.PremiumCustomer;

public class CustomerTest {
	
	
	
	@Test
	public void testNoArgsPCGetters()
	{
		PremiumCustomer vipCustom = new PremiumCustomer();
		Integer yearVal = vipCustom.getYears();
		String vipVal = vipCustom.getVipCard();
		assertEquals(yearVal, 0, .001);
		assertEquals(vipVal, "");
	}
	
	@Test
	public void testNoArgsPCSetters()
	{
		PremiumCustomer vipCustom = new PremiumCustomer();
		vipCustom.setYears(5);
		vipCustom.setVipCard("4444555566667777");
		Integer yearVal = vipCustom.getYears();
		String vipVal = vipCustom.getVipCard();
		assertEquals(yearVal, 5, .001);
		assertEquals(vipVal, "4444555566667777");
		
	}
	
	@Test
	public void testNoArgsPCBuy()
	{
		PremiumCustomer vipCustom = new PremiumCustomer("4444555566667777",3,"Daxter",20000,"Ultra rare pokemon Card", 2500);
		//vipCustom.buy();
		vipCustom.discountPrice(2500);
		assertEquals(vipCustom.discountPrice(20000), 17000, .001);
	}

}
