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
	public boolean login(String username, String password) throws InvalidCredentialsException {
		boolean b = false;
		if(username.equals(this.username) && password.equals(this.password))
		{
			b=true;
			System.out.println("username and password match...");
		} 
		else
			throw new InvalidCredentialsException("username and password does not match...");
			b=false;
			
		//If the user logged in successfully return true
		return b;
	}
	
	//Implement the method below to throw a custom Exception called InsufficientFundsException if the users balance is not high enough to
	//pay for the cost
	public int pay(int cost) throws InsufficientFundsException {
		
		if(balance>=cost)
		{
			this.balance-=cost;
			System.out.println("payment has been succesfull!...");
		}
		else
		{
			throw new InsufficientFundsException("you do not have sufficient fund to pay");
			
		}
		//Should return the remaining balance if they had enough money
		return this.balance;
	}
	
}
