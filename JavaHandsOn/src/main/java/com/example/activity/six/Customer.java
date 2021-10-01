package com.example.activity.six;

public abstract class Customer {
	
	public String name;
	public String cart;
	public double balance;
	public double cartCost;
	
	public Customer(String name, double balance, String cart, double cartCost) {
		
		this.name = name;
		this.balance = balance;
		this.cart = cart;
		this.cartCost = cartCost;
		
	}
	
	public String addToCart(String item, double cost) {
		
		cart = cart + " , " + item;
		cartCost += cost;
		return cart;
	}
	
	public abstract void buy();

}
