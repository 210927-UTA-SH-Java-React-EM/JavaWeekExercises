package com.example.activity.five;

public class PremiumCustomer extends Customer implements Premium{

	private int vipCard;
	private int year;
	
	public PremiumCustomer() {
		super("", 0.0, "", 0.0);
		this.setVipCard(0);
		this.setYear(0);
	}
	public PremiumCustomer(String name, double balance, String cart, double cartCost,int vipCard,int year) {
		super(name, balance, cart, cartCost);
		// TODO Auto-generated constructor stub
		
		this.setVipCard(vipCard);
		this.setYear(year);
	}
	
	
	@Override
	public double discountPrice(int a) {
		// TODO Auto-generated method stub
		double i=a*0.85;
		return i;
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub	
	}
	
	public int getVipCard() {
		return vipCard;
	}
	public void setVipCard(int vipCard) {
		this.vipCard = vipCard;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
