package com.example.activity.seven;

public class CustomExceptionsDriver {
	public static void main (String[] args) {
	User newUser = new User("TBJones", "nopassword", 40);
	newUser.login("TBJones1", "nopassword");
	newUser.pay(45);
}
	}
