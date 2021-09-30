package com.example.activity.five;

public class PremiumCustomer extends Customer implements Premium {
	
	
	private int vipCard;
	private int years;
	
	public PremiumCustomer(){
		super();
	}
	
	public PremiumCustomer(String name, double balance, String cart, double cartCost) {
		super(name, balance, cart, cartCost);
		
	}
	
	@Override
	public int discountPrice(int price) {
		
		double discount = .15;
		double discDiff = price * discount;
		double discountcost = price - discDiff; 
		return (int) discountcost;
	}
	@Override
	public void buy() {
		
		System.out.println(cart);
		
		System.out.println("Total: $" + cartCost);
		int dollarsOff = this.discountPrice((int)cartCost);
		System.out.println("Discount Total(15%): $" + dollarsOff);
		balance = balance - dollarsOff;
		cartCost = 0;
		cart = "";
		
		System.out.println("Thank you come again!");
		
		
		
	}
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
	
	

}
