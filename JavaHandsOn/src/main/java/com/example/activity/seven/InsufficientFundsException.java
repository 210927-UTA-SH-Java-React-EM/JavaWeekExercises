package com.example.activity.seven;

//Turn this ordinary class into a unchecked exception
public class InsufficientFundsException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {
		super("I'm sorry, you do not have sufficient funds to complete this purchase.");
	}
	
}
