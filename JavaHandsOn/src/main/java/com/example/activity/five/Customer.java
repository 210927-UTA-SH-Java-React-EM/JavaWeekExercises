package com.example.activity.five;

/*
 * 1. Create an abstract class called Customer with:
	- Four properties, name, balance, cart (String), cartCost
	
	- An all-args constructor used for constructor chaining
	
	- A public method called addToCart which takes a item as a string, and a cost
	  as an int, and adds the item to the cart and cost to the cartCost, returns the
	  updated cart
	  
	- A public abstract method called buy
 */

public abstract class Customer {
	String name;
	double balance;
	String cart;
	int cartCost;
	
	public Customer(String name, double balance, String cart, int cartCost)
	{
		this.name = name;
		this.balance = balance;
		this.cart = cart;
		this.cartCost = cartCost;
	}
	
	public String addToCart(String item, int cost) 
	{
		cart += ";" + item;
		cartCost += cost;
		return cart;
	}
	
	public abstract void buy();
}
