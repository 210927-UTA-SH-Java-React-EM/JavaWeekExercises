package com.example.activity.five;

public class PremiumCustomer extends Customer implements Premium {

	private String vipCard;
	private Integer years;
	
	public PremiumCustomer()
	{
		super("", 0, "", 0);
		this.setVipCard("");
		this.setYears(0);
		
	}
	
	public PremiumCustomer(String vipCard, Integer years, String name, double balance, String cart, double cartCost)
	{
		super(name, balance, cart, cartCost);
		this.vipCard = vipCard;
		this.years = years;
	}

	public String getVipCard() {
		return vipCard;
	}

	public void setVipCard(String vipCard) {
		this.vipCard = vipCard;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}
	

	@Override
	public void buy() {
		if (this.balance >= this.discountPrice(this.cartCost))
		{
			System.out.println(tittle + " 15% discount!");
			double currentBalance =  this.balance - this.discountPrice(this.cartCost);
			this.balance = currentBalance;
			System.out.println("Thanks for the Purchase!");
			
		}else{
			System.out.println("Insufficient funds, purchase rejected!");
		}

	}
	

}
