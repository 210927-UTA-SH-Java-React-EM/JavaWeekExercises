package com.example.activity.seven;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.CloneNotSupportedException;

//Turn this ordinary class into a checked exception using your knowledge from training
public class InvalidCredentialsException extends Exception {

	public InvalidCredentialsException() {
		super();
	}

	public InvalidCredentialsException(String message) {
		super(message);		
	}

	public InvalidCredentialsException(Throwable cause) {
		super(cause);		
	}
	
	public InvalidCredentialsException(boolean boo) {
		super();
		
	}

}
