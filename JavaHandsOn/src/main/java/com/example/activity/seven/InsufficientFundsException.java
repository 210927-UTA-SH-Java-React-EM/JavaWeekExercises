package com.example.activity.seven;

//Turn this ordinary class into a unchecked exception
public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException() {
	}
	
	public InsufficientFundsException(String message) {
		super(message);
	}

}
