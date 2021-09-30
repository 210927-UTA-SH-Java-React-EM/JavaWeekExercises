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
	
	// Implement the method below to throw a custom Exception called InvalidCredentialsException 
	// if the users credentials are incorrect
	public boolean login(String username, String password) throws InvalidCredentialsException {
		boolean result = false;
		if (this.username.equals(username) && this.password.equals(password))
		{
			result = true;
		}else { throw new InvalidCredentialsException(); }
		//If the user logged in successfully return true
		return result;
	}
	
	//Implement the method below to throw a custom Exception called InsufficientFundsException if the users balance is not high enough to
	//pay for the cost
	public int pay(int cost) throws InsufficientFundsException {
		int remainingBalance = 0;
		
		//Should return the remaining balance if they had enough money
		if (cost > this.balance)
		{ 
			throw new InsufficientFundsException();
		}
		else { remainingBalance = this.balance - cost; }

		return remainingBalance;
	}
	
}
