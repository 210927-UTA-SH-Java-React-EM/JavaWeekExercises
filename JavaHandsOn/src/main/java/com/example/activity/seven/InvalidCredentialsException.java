package com.example.activity.seven;

//Turn this ordinary class into a checked exception using your knowledge from training
public class InvalidCredentialsException extends RuntimeException {

    public InvalidCredentialsException(String error) {
        super(error);
    }
}
