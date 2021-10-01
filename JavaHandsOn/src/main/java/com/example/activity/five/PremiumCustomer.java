package com.example.activity.five;

public class PremiumCustomer extends Customer implements Premium {
	
	
	private int vipCard;
	private int years;
	
	
	public PremiumCustomer() {
		super("Jim", 0, "Pam", 3);
		System.out.println("Customer made no args");
	}
	
	public PremiumCustomer(int vipCard, int years) {
		super("Bob", 0, "Jane", 3);
		this.vipCard = vipCard;
		this.setYears(years);
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double discount(int reduc) {
		// TODO Auto-generated method stub
		
		//I guess reduc is the total price?
		
		double price = reduc;
		price = price - (price *.15);
		
		return price;
		
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
