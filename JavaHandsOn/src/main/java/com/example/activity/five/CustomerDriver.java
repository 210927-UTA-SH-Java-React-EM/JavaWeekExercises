package com.example.activity.five;



public class CustomerDriver {
	public static void main(String[] args) {
		PremiumCustomer newCust = new PremiumCustomer("Natawnee", 100.00,"",0.00,4147,1);
		newCust.addToCartItem("Eggs");
		newCust.addToCartCost(2.50);
		newCust.addToCartItem("Coffee Creamer");
		newCust.addToCartCost(3.00);
		newCust.addToCartItem("Ice Cream");
		newCust.addToCartCost(5.00);
		if(newCust.isPremium == true) {
			newCust.setCartCost(newCust.discountPrice(newCust.cartCost));
			newCust.buy();
		}
		else {
		newCust.buy();
	}
}
}
