package com.example.activity.seven;

//Turn this ordinary class into a checked exception using your knowledge from training
public class InvalidCredentialsException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6756598016118623904L;

	public InvalidCredentialsException(String message) {
		super(message);
	}
	
	public InvalidCredentialsException() {
		super("Invalid credentials");
	}

}
