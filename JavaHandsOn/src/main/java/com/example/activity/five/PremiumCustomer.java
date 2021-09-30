package com.example.activity.five;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PremiumCustomer extends Customer implements Premium{
NumberFormat formatter = new DecimalFormat("#0.00");
private int vipCard;
private int years;
boolean isPremium = true;
public PremiumCustomer()
{
	super();
}

public PremiumCustomer(String name, double balance, String cart, double cartCost, int vipCard, int years) {
	super(name, balance, cart, cartCost);
	this.vipCard = vipCard;
	this.years = years;
}

public void buy(double purchaseCost) {
	System.out.println("We've completed your transaction!");
	balance -= cartCost;
	System.out.println("Your available balance is now $" + formatter.format(balance));
}

public double discountPrice(double cartCost) {
	double discountAmount = 0;
	discountAmount = (cartCost * .15);
	cartCost -= discountAmount;
	System.out.println("Because of your loyal membership, we've taken 10% ($" + formatter.format(discountAmount) + ") off of your order!");
	System.out.println("Your total is $" +formatter.format(cartCost));
	return cartCost;
}

public NumberFormat getFormatter() {
	return formatter;
}

public void setFormatter(NumberFormat formatter) {
	this.formatter = formatter;
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

public boolean isPremium() {
	return isPremium;
}

public void setPremium(boolean isPremium) {
	this.isPremium = isPremium;
}
}
