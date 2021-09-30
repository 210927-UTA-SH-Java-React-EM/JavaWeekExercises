package com.example.activity.five;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class Customer {
NumberFormat formatter = new DecimalFormat("#0.00");
String name;
double balance;
String cart = "";
double cartCost;

public Customer()
{
}

public Customer(String name, double balance, String cart, double cartCost)
{
	this.name = name;
	this.balance = balance;
	this.cart = cart;
	this.cartCost = cartCost;
}

public String addToCart(String item, double cost) {
	cart.concat("," + item);
	cartCost += cost;
	System.out.println("Added " + item + " to your cart.");
	System.out.println("At a cost of: $" + formatter.format(cartCost));
	return cart;
}

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

public void setCartCost(double cartCost) {
	this.cartCost = cartCost;
}

public abstract void buy(double cartCost);


}
