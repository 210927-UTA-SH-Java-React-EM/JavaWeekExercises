package com.example.activity.five;

abstract class Customer {
	
	String name;
	double balance;
	String cart="";
	double cartCost;
	
	
	Customer(){}
	
	Customer(String name, double balance, String cart, double cartCost){
		this.name = name;
		this.balance = balance;
		this.cart = cart;
		this.cartCost = cartCost;
		
	}
	
	public String addToCart(String item, int cost) {
		
		cart = item;
		
		cartCost = cost + cartCost;
		
		System.out.println(cart);
		return cart;
	}
	
	public abstract void buy();

	
//	public String CustomerAccount() {
//		return "Customer: \nName: " + name + "\nBalance: $" + balance + "\nCart: " + cart + "\n\nCartCost: $" + cartCost;
//	}
	
	

}
