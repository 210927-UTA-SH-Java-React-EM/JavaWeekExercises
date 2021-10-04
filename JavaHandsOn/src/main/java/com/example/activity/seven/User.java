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

	// Implement the method below to throw a custom Exception called
	// InvalidCredentialsException if the users credentials are incorrect
	public boolean login(String loginUsername, String loginPassword) throws InvalidCredentialsException {

		if (loginUsername != username || loginPassword != password) {
			throw new InvalidCredentialsException("Login credentials incorrect; please try again.");
		} else {
			return true;
		}
	}

	// Implement the method below to throw a custom Exception called
	// InsufficientFundsException if the users balance is not high enough to
	// pay for the cost
	public int pay(int cost) throws InsufficientFundsException {

		// Should return the remaining balance if they had enough money

		if ((balance - cost) < 0) {
			throw new InsufficientFundsException("Insufficent funds to complete transaction.");
		} else {
			balance -= cost;
			return balance;
		}
	}

}
