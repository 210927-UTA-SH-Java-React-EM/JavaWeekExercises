package com.example.activity.seven;

import java.io.IOException;

//Turn this ordinary class into a checked exception using your knowledge from training
public class InvalidCredentialsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidCredentialsException() {
		super("Non valid credentials");
	}
	
}
