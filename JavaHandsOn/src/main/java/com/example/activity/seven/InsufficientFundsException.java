package com.example.activity.seven;

//Turn this ordinary class into a unchecked exception
public class InsufficientFundsException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
	}

}
