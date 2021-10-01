package com.example.activity.five;

public class PremiumCustomer extends Customer implements Premium {
//- extends Customer, and implements Premium
//	
//	- has private properties vipCard which is their card number, a integer years
//	  which keeps track of the number of years they have been vip
		private int vipCard;
		private int years;
//	- The PremiumCustomer should have a no-args constructor, and an all args
//	  constructor that allows you to set the properties of the Customer class,
//	  and the properties of the PremiumCustomer
	public PremiumCustomer() {
		//call to super to set the properties
		super("", 0.0, "", 0.0);
 }
	
	public PremiumCustomer(String name, double balance, String cart, double cartCost, int vipCard, int years) {
		this();
		this.vipCard = vipCard;
		this.years = years;
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
	
	public void setBalance(Double balance) {
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



//	- implement the abstract methods so that the premium user gets a discount
//	  of 15% on all items in their cart, and the discounted cost gets deducted
//	  from their balance
	
	public int getVipCard() {
		return vipCard;
	}
	
	public void setVipCard(int vipCard) {
		this.vipCard = vipCard;
	}
	
	public int getYears() {
		return years;
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	
	@Override
	public double discountPrice(double amount) {
		return (double) (amount * .85);
		
	}
	
	@Override
	public void buy() {
		if(balance - discountPrice(cartCost) < 0.0) {
			return;
		}
		balance -= discountPrice(cartCost);
		cartCost = 0;
		cart = "";
	}

	
	
	
}
