package com.example.activity.five;

public abstract class Customer {
	
	//Four properties, name, balance, cart (String), cartCost

	String name;
    int balance;
    String cart;
    int cartCost;
    
    public Customer()
    {
    	
    }
    
    public Customer(String name,int balance, String cart, int cartCost)
    {
    this.balance = balance;
    this.name = name;
    this.cart = cart;
    this.cartCost = cartCost;
    }
    
	/*A public method called addToCart which takes a item as a string, and a cost
	  as an int, and adds the item to the cart and cost to the cartCost, returns the
	  updated cart*/
    
    public String addToCart(String item,int cost)
    {
    	cart+= item;
    	cartCost+= cost;
    return cart;	
    }
	  
	//A public abstract method called buy
    
    public abstract void buy();

}