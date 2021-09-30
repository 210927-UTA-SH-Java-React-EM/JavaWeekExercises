package com.example.activity.seven;

//Turn this ordinary class into a checked exception using your knowledge from training
public class InvalidCredentialsException extends Exception {
	
	public InvalidCredentialsException() {
		super("Invalid Username or Password!!");
	}
	

}
