package com.example.activity.five;

import java.util.HashMap; // import the HashMap class

public abstract class Customer {
	
	//name, balance, cart (String), cartCost
	String name;
	String cart;
	int balance = 0;
	int cartcost;

	HashMap<String, Double> cartMap = new HashMap<String, Double>();	
		
	Customer() {
		
	}
	
	//An all-args constructor used for constructor chaining
	public Customer(String name, String cart, int balance, int cartcost) {
		this.name = name;
		this.cart = cart;
		this.balance = balance;
		this.cartcost = cartcost;
	}
	
	/*A public method called addToCart which takes a item as a string, and a cost
	  as an int, and adds the item to the cart and cost to the cartCost, returns the
	  updated cart
	  */
	public String addToCart(String item, int cost) {
		this.cart = item;
		this.cartcost = cost;
		this.balance += cost;		
		return this.cart;		
	}
	
	//A public abstract method called buy
	public abstract HashMap<String, Double> buy(String cart, int cartcost);

}
