/*3. Create a class called PremiumCustomer that:
	- extends Customer, and implements Premium
	
	- has private properties vipCard which is their card number, a integer years
	  which keeps track of the number of years they have been vip
	
	- The PremiumCustomer should have a no-args constructor, and an all args
	  constructor that allows you to set the properties of the Customer class,
	  and the properties of the PremiumCustomer
	  
	- implement the abstract methods so that the premium user gets a discount
	  of 15% on all items in their cart, and the discounted cost gets deducted
	  from their balance
	  
	- implement the getters and setters for the premium user*/
package com.example.activity.five;

public class PremiumCustomer extends Customer implements Premium{

	private String cardNumber;
	private int years;
	private int discount = 15;
	
	public PremiumCustomer() {
		
	}
	public PremiumCustomer(String name, String cart, float balance, float carCost) {
		super(name, cart, balance, carCost);
	}
	
	public float buy() {
		float finalPrice=discountPrice(discount);
		System.out.println(finalPrice);
		balance-=finalPrice;
		System.out.println("Bought");
		
		return finalPrice;
	}
	
	public float discountPrice(int discount) {
		
		float percentageLeft = (cartCost * (100-discount))/100;
		return percentageLeft;
	}
	
	
	
}
