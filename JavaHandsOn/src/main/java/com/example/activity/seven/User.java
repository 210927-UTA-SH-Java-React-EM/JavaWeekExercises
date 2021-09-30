package com.example.activity.seven;

public class User {
	
	private String username;
	private String password;
	private int balance;
	
	public User(String username, String password, int balance) {
		this.username = username;
		this.password = password;
		this.balance = balance;
	}
	
	//Implement the method below to throw a custom Exception called InvalidCredentialsException if the users credentials are incorrect
	public boolean login(String username, String password) throws InvalidCredentialsException{
		if(username==this.username && password==this.password)
		{
			return true;
		}
		else
		{
			throw new InvalidCredentialsException();
		}
		//If the user logged in successfully return true
	}
	
	//Implement the method below to throw a custom Exception called InsufficientFundsException if the users balance is not high enough to
	//pay for the cost
	public int pay(int cost) throws InsufficientFundsException{
		if(this.balance<cost)
		{
			throw new InsufficientFundsException("You don't have enough funds to cover the cost");
		}
		else
		{
			this.balance = this.balance-cost;
		}
		//Should return the remaining balance if they had enough money
		return this.balance;
	}
	
}
