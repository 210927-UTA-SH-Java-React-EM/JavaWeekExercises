package com.example.activity.five;

public class PremiumCustomer extends Customer implements Premium {

	private String vipCard;
	private int years;
	
	
	public PremiumCustomer(String name, int balance, String cart, int cartCost, String card, int year) {
		super(name, balance, cart, cartCost);
		this.vipCard = card;
		this.years = year;
	}
	

	@Override
	public int discountPrice() {
		// TODO Auto-generated method stub
		return (int) (this.balance*0.85);
	}
	
	@Override
	public void buy() {
		this.balance = this.balance - discountPrice();
		
	}
	
	public void setVipCard(String vip)
	{
		this.vipCard = vip;
	}
	
	public void setYears(int years)
	{
		this.years = years;
	}
	
	public String getVipCard()
	{
		return this.vipCard;
	}
	
	public int getYears()
	{
		return this.years;
	}


}
