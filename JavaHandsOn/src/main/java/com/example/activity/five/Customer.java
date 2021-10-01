package com.example.activity.five;

public abstract class Customer {
 public String name;
 public int balance;
 public String cart;
 public int cartCost;
 
 public Customer(String name, int balance, String cart, int cartCost) {
	 this.name = name;
	 this.balance = balance;
	 this.cart = cart;
	 this.cartCost = cartCost;
 }
 
 public String addToCart(String item, int cost) {
	this.cart = cart.concat(item + " : " + cost);
	return cart;
 }
 
 public abstract  void buy();
 
}
