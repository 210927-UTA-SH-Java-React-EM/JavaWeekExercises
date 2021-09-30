package com.example.activity.five;

public class PremiumCustomer extends Customer implements Premium{
	
	private int vipCard;
	private int years;
	
	 
	
	  public PremiumCustomer()
	  {
		 vipCard = 0;
		 years = 0;
	  }
	  
	 public PremiumCustomer(String name,int balance, String cart, int cartCost,int vipCard ,int years)
	  {
		 super(name,balance,cart,cartCost);
		 this.vipCard = vipCard;
		 this.years = years; 
	  }
	  

	 public int getvipCard()
	 {
		 return vipCard;
	 }
	 public void setvipCard(int vipCard)
	 {
		 this.vipCard = vipCard;
	 }
	 public int getyears()
	 {
		 return years;
	 }
	 public void setyears(int years)
	 {
		 this.years = years;
	 }
	 
	 
			 /* 	- implement the abstract methods so that the premium user gets a discount
					  of 15% on all items in their cart, and the discounted cost gets deducted
					  from their balance
			*/
	
	@Override
	public int discountPrice(int x) {
		
	    x = x * 15/100;	
		
      balance -= x;	    
		return x;
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}
	

}
