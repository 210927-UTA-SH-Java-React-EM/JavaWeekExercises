package com.example.activity.seven;

public class T {
	
	private String username;
	private String password;
	private int balance;
	
	public T(String username, String password, int balance) {
		this.username = username;
		this.password = password;
		this.balance = balance;
	}
	
	//Implement the method below to throw a custom Exception called InvalidCredentialsException if the users credentials are incorrect
	public boolean login(String username, String password) throws InvalidCredentialsException {
		if (username != this.username || password != this.password)
			throw new InvalidCredentialsException();
		//If the user logged in successfully return true
		return true;
	}
	
	public int pay(int cost) throws InsufficientFundsException {
		if (cost > balance)
			throw new InsufficientFundsException();
		return balance -= cost;
	}
	
}
