package com.example.activity.five;

public interface Premium {

	String tittle = "VIP Customer";
	
	default double discountPrice(double pricePreDiscount)
	{
		
		double grandTotal;
		double perceDiscount = 15;
		double discount = (perceDiscount * pricePreDiscount) / 100;
		
		grandTotal = pricePreDiscount - discount;
		return grandTotal;
	}
	
}
