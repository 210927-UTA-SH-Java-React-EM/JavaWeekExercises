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
	
	/*Implement the method below to throw a custom Exception called InvalidCredentialsException if the users 
	  credentials are incorrect 
	*/
	public boolean login(String username, String password) throws InvalidCredentialsException {
		boolean boo = false;
		if (this.getUsername().equalsIgnoreCase(username) && this.getPassword().equals(password)) {
			System.out.println("Success");
			boo = true;
		} else {
			System.out.println("Fail");
			throw new InvalidCredentialsException("invalid credentials");
		}		
		return boo;
		
	}
	
	
	/*Implement the method below to throw a custom Exception called InsufficientFundsException if the users 
	  balance is not high enough to pay for the cost
	  Should return the remaining balance if they had enough money
	*/
	public int pay(int cost) throws InsufficientFundsException {
		int balance = this.getBalance() - cost;
		if (balance >= 0) {
			this.setBalance(balance);
			System.out.println("Success shopping");
	    } else {
	    	System.out.println("Fail shopping");
	        throw new InsufficientFundsException("Insufficient fund");
	    }
		return this.balance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) throws InvalidCredentialsException {
		User u = new User(null, null, 20);
		u.setUsername("Smith");
		u.setPassword("pass123");
		System.out.println(u.getUsername()+" "+u.getPassword()+" "+u.getBalance());
		
		//For testing login success
		u.login(u.getUsername(), u.getPassword());
		
		//For testing sufficient fund
		try {
			u.pay(10);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
		
		//For testing wrong login credential
		u.login("bisi", "p1234");
		
		//For testing insufficient fund
		try {
			u.pay(50);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
		
	}
	
}
