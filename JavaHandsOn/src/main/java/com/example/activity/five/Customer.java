package com.example.activity.five;

public abstract class Customer {

	String name;
	double balance;
	String cart;
	double cartCost;
	
	public Customer(String name, double balance, String cart, double cartCost)
	{
		this.name = name;
		this.balance = balance;
		this.cart = cart;
		this.cartCost = cartCost;
	}
	
	public void addToCart(String item, double price)
	{
		this.cart = item;
		this.cartCost = price;
		//this.cartCost = Double.valueOf(price);
		System.out.println("Cart items: " + cart + "Cart total: " + cartCost);
	}
	
	public abstract void buy();
	
}
