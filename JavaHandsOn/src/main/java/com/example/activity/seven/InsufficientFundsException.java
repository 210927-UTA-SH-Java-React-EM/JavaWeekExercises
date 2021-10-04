package com.example.activity.seven;

//Turn this ordinary class into a unchecked exception
public class InsufficientFundsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InsufficientFundsException() {
		System.out.println("No dice!!!! You do not have enough money, you bum!"
				+ " This will sourly affect your credit... too bad");
	}

}
