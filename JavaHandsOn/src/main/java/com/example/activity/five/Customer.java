package com.example.activity.five;

public abstract class Customer {
	private String name;
	private double balance;
	private String cart; 
	private double cartCost;
	
	public Customer(String name, double balance, String cart, double cartCost) {
		this.setName(name);
		this.setBalance(balance);
		this.setCart(cart);
		this.setCartCost(cartCost);
		
	}
	public String addToCart(String item, int cost)
	{
		setCart(getCart()+","+item);
		setCartCost(getCartCost() + cost);
		return getCart();
	}
	
	public abstract void buy();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCart() {
		return cart;
	}
	public void setCart(String cart) {
		this.cart = cart;
	}
	public double getCartCost() {
		return cartCost;
	}
	public void setCartCost(double cartCost2) {
		this.cartCost = cartCost2;
	}
}
