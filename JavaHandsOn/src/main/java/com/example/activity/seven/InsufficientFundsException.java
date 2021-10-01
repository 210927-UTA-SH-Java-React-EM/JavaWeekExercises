package com.example.activity.seven;

//Turn this ordinary class into a unchecked exception
public class InsufficientFundsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5127083705006224631L;

	
	
	public InsufficientFundsException() {
		super("You need more money");
	}
}
