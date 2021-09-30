package com.example.activity.seven;

//Turn this ordinary class into a checked exception using your knowledge from training
public class InvalidCredentialsException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public InvalidCredentialsException() {
		System.out.println("No dice!!!! You do not have correct credentials!"
				+ " Are you a bad actor? ...deploying violence");
	}
	
}
