 package com.example.test.activity.six;

import org.junit.Test;

import com.example.activity.five.PremiumCustomer;

public class CustomerTest {
	
	PremiumCustomer pc= new PremiumCustomer();
	PremiumCustomer pc1= new PremiumCustomer("Riya",99.99, "shoe,tie,knife", 109.99,12345678,10);
	
	@Test
	public void testNoArgConstructor()
	{
		String name = pc.getName();
		double bal=pc.getBalance();
		String cart=pc.getCart();
		double cost=pc.getCartCost();
		int vipCard=pc.getVipCard();
		int year=pc.getYear();
		
		if(name.equals("") && bal==0.0 && cart.equals("") && cost==0.0 && vipCard==0 && year==0)
		{
			System.out.println("No argument consturctor is all set to go!....");
		}	
	}
	
	@Test
	public void testAllArgConstructor()
	{
		String name = pc1.getName();
		double bal=pc1.getBalance();
		String cart=pc1.getCart();
		double cost=pc1.getCartCost();
		int vipCard=pc1.getVipCard();
		int year=pc1.getYear();
		
		if(name.equals("Riya") && bal==99.99 && cart.equals("shoe,tie,knife") && cost==109.99 && vipCard==12345678 && year==10)
		{
			System.out.println("All argument consturctor is all set to go!....");
		}
		
	}
	
	@Test
	public void testdiscountPrice()
	{
		double d= pc1.discountPrice(100);
		if(d==85.0)
		{
			System.out.println("discount price method is all set to go!....");
		}
	}
	
}
