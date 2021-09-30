package com.example.activity.five;

public class PremiumCustomer extends Customer implements Premium {

	private int vipCard;
	private int years;
	
	public PremiumCustomer() {
		super("", 0, "", 0);
		this.vipCard = 0;
		this.years = 0;
	}
	
	public PremiumCustomer(String name, int bal, String cart, int cartCost, int vipCard, int years) {
		super(name, bal, cart, cartCost);
		this.vipCard = vipCard;
		this.years = years;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int bal) {
		this.balance = bal;
	}
	
	public String getCart() {
		return this.cart;
	}
	
	public void setCart(String c) {
		this.cart = c;
	}
	
	public int getCartCost() {
		return this.cartCost;
	}
	
	public void setCartCost(int cartCost) {
		this.cartCost = cartCost;
	}
	
	public int getVipCard() {
		return this.vipCard;
	}
	
	public void setVipCard(int vip) {
		this.vipCard = vip;
	}
	
	public int getYears() {
		return this.years;
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	
	@Override
	public int discountPrice(int price) {
		// TODO Auto-generated method stub
		double tempPrice = (double)price * 0.85d;
		
		return (int)tempPrice;
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		this.balance -= discountPrice(this.cartCost);
	}

}
