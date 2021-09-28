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
		if (!username.equals(this.username) || !password.equals(this.password)){
			throw new InvalidCredentialsException("Invalid Credentials");
		}else return true;
		//If the user logged in successfully return true
	}
	
	//Implement the method below to throw a custom Exception called InsufficientFundsException if the users balance is not high enough to
	//pay for the cost
	public int pay(int cost) throws InsufficientFundsException{
		if (cost > this.balance){
			throw new InsufficientFundsException("Cost > than Balance");
		}
		//Should return the remaining balance if they had enough money
		return balance-cost;
	}
	
}
