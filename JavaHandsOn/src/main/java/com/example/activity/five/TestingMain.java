package com.example.activity.five;

public class TestingMain {

	public static void main(String[] args) {
		
		PremiumCustomer pCustomer;
		PremiumCustomer pCustomer2;
		
		pCustomer = new PremiumCustomer("Rick", "", 2000, 0);
		pCustomer.AddToCart("CD Paramore", 20);
		pCustomer.AddToCart("Wine Rose", 40);
		pCustomer.AddToCart("Beer", 10);
		pCustomer.AddToCart("Chocolate", 5);
		pCustomer.AddToCart("Apple pie", 7);
		
		System.out.println(pCustomer.buy()); 

	}

}
