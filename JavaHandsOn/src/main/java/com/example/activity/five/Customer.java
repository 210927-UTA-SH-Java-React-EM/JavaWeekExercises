package com.example.activity.five;

/*1. Create an abstract class called Customer with:
	- Four properties, name, balance, cart (String), cartCost
	
	- An all-args constructor used for constructor chaining
	
	- A public method called addToCart which takes a item as a string, and a cost
	  as an int, and adds the item to the cart and cost to the cartCost, returns the
	  updated cart
	  
	- A public abstract method called buy
	*/

public abstract class Customer {
	protected String name,cart;
	protected float balance, cartCost;
	
	public Customer() {
		
	}
	
	public Customer(String name, String cart, float balance, float carCost){
		this.name= name;
		this.cart = cart;
		this.balance = balance;
		this.cartCost = carCost;
	}
	 public String AddToCart(String item, int cost) {
		 cartCost+=cost;
		 System.out.println(cartCost);
		 return cart+","+item;
	 }
	 
	 public abstract float buy();
	
}
