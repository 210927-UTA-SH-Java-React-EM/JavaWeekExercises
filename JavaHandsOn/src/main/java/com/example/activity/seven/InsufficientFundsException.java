package com.example.activity.seven;

//Turn this ordinary class into a unchecked exception
public class InsufficientFundsException extends RuntimeException {
	
	public InsufficientFundsException() {
		super("Insufficient Funds!!");
	}
	
}
