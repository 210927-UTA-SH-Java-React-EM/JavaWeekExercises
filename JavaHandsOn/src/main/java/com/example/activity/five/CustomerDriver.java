package com.example.activity.five;



public class CustomerDriver {
	public static void main(String[] args) {
		PremiumCustomer newCust = new PremiumCustomer("Taylor", 500.00,"",0.00,4147,1);
		newCust.addToCart("Diapers", 30);
		if(newCust.isPremium == true) {
			newCust.setCartCost(newCust.discountPrice(newCust.cartCost));
			newCust.buy(newCust.cartCost);
		}
		else {
		newCust.buy(newCust.cartCost);
	}
}
}
