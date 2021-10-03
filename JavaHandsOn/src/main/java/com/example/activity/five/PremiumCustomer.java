package com.example.activity.five;

import java.util.HashMap;
import java.util.Map;

public class PremiumCustomer extends Customer implements Premium {
	
	/*has private properties vipCard which is their card number, a integer years
	  which keeps track of the number of years they have been vip
	*/
	private int vipCard;
	private int years;	
	int discount;
	
	/*The PremiumCustomer should have a no-args constructor, and an all args
	  constructor that allows you to set the properties of the Customer class,
	  and the properties of the PremiumCustomer
	*/
	
	PremiumCustomer() {
		
	}	

	PremiumCustomer(String name, String cart, int balance, int cartcost) {
		super(name, cart, balance, cartcost);		
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

	public double discountPrice(int cartcost) {		
		return cartcost-cartcost*0.15;		
	}

	public HashMap<String, Double> buy(String cart, int cartcost) {
		this.cartMap.put(cart, new Double(discountPrice(cartcost)));
		return this.cartMap;
	}

}
