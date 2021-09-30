package com.example.activity.five;

/*
3. Create a class called PremiumCustomer that:
	  
	- implement the abstract methods so that the premium user gets a discount
	  of 15% on all items in their cart, and the discounted cost gets deducted
	  from their balance
	  
	- implement the getters and setters for the premium user
 */

public class PremiumCustomer extends Customer implements Premium {
	
	private int vipCard;
	private int years;
	
	public PremiumCustomer() {
		super("", 0, "", 0);
		vipCard = 0;
		years = 0;
	}
	
	public PremiumCustomer(String name, int balance, String cart, int cost, int vipCard, int years) {
		super(name, balance, cart, cost);
		this.vipCard = vipCard;
		this.years = years;
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

	public int discountPrice(int price) {
		return (int) (price * .85);
	}

	@Override
	public void buy() {
		if (balance - discountPrice(cartCost) < 0)
			return;
		balance -= discountPrice(cartCost);
		cartCost = 0;
		cart = "";
	}

}
