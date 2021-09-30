package com.example.activity.five;

public abstract class Customer {

	String name;
	int balance;
	String cart;
	int cartCost;
	
	Customer(String name, int bal, String cart, int cartCost) {
		this.name = name;
		this.balance = bal;
		this.cart = cart;
		this.cartCost = cartCost;
	}
	
	public String addToCart(String item, int cost) {
		this.cartCost += cost;
		this.cart += item + " ";
		return this.cart;
	}
	
	public abstract void buy();
	
}
