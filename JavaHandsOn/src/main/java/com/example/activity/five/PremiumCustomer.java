package com.example.activity.five;


/*
 * Questions
 * 1. Is the int param on the discountPrice method a specified discount other than 85%? ..what exactly is it?
 * 2. What is the title property in the premium interface for?
 */

/**********************************************************************************
 * Create a class called PremiumCustomer that:
	- extends Customer, and implements Premium
 **********************************************************************************/
public class PremiumCustomer extends Customer implements Premium
{
	/******************************************************************************
	 * has private properties vipCard which is their card number, a integer years
	  which keeps track of the number of years they have been vip
	 ******************************************************************************/
	// Use static variable currentCardNumber to provide unique card number on 
	// initialization
	private static long currentCardNumber;
	// The VIP discount is 15% or 85% of the total 
	private final static double vipDiscountFactor = 0.85;
	private long vipCard;
	private int years;
	
	/*******************************************************************************
	 * The PremiumCustomer should have a no-args
	 *******************************************************************************/
	public PremiumCustomer()
	{	
		// Set the super properties: String:name, double:balance, String:cart, int:cartCost
		this("Premium Ted", 20.00, "", 0);
	}
	
	/*******************************************************************************
	 * The PremiumCustomer should have an all args
	  constructor that allows you to set the properties of the Customer class,
	  and the properties of the PremiumCustomer
	 ********************************************************************************/
	public PremiumCustomer(String name, double balance, String cart, int cartCost) {
		super(name, balance, cart, cartCost);
		this.vipCard = getCardNumber();
		this.years = 1;
	}

	/*******************************************************************************
	 * implement the abstract methods so that the premium user gets a discount
	  of 15% on all items in their cart, and the discounted cost gets deducted
	  from their balance
	 *******************************************************************************/
	@Override
	public int discountPrice(int p) {
		int result = this.years > 0 ? (int)(super.cartCost * vipDiscountFactor): super.cartCost;
		return result;
	}

	@Override
	public void buy() {
		super.balance = discountPrice(5);
	}
	
	// Increment the static card number, and return a value for a new card.
	private long getCardNumber()
	{
		return ++currentCardNumber;
	}
	
	/* *************************************************************
	 * Implement the getters and setters for the premium user/
	 ***************************************************************/
	// Basic getters
	public int getYears() {return this.years;}
	public long getVipCard() {return this.vipCard;}
	public String getName() {return super.name;}
	public double getBalance() {return super.balance;}
	public String getCart() {return super.cart;}
	public int getCartCost() {return super.cartCost;}
	
	// Basic Setters
	public void setYears(int years) {this.years = years;}
	public void setVipCard(long vipCard) {this.vipCard = vipCard;}
	public void setName(String name) {super.name = name;}
	public void setBalance(double balance) {super.balance = balance;}
	public void setCart(String cart) {super.cart = cart;}
	public void setCartCost(int cartCost) {super.cartCost = cartCost;}
}
