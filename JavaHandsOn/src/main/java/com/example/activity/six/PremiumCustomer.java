package com.example.activity.six;

public class PremiumCustomer extends Customer implements Premium {
	
	private int vipCard;
	private int years;
	
	public PremiumCustomer() {
		
		super("", 0, "", 0);
		vipCard =0;
		years = 0;
		
	}
	
	public PremiumCustomer(String name, double balance, String cart, double cartCost, int vipCard, int years) {
		
		super(name, balance, cart, cartCost);
		this.vipCard = vipCard;
		this.years = years;
	}
	
	public double discountPrice() {
		
		return cartCost*0.15;
	}
	
	public int getvipCard() {
		
		return vipCard;
	}
	
	public int getyears() {
		
		return years;
	}
	
	public void setvipCard(int card) {
		
		this.vipCard = card;
	}
	
	public void setyears(int year) {
		
		this.years = year;
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
		cartCost-=discountPrice();
		balance-=cartCost;
	}
	
	
	

}
