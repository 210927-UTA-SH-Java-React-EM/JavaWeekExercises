package com.example.activity.seven;

//Turn this ordinary class into a unchecked exception
public class InsufficientFundsException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public InsufficientFundsException() {
		super("There is not enough funds to buy");
	}

}
