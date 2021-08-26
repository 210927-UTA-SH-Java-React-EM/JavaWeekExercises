package com.example.test.activity.seven;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.seven.InsufficientFundsException;
import com.example.activity.seven.InvalidCredentialsException;
import com.example.activity.seven.User;

public class ExceptionsTest {

	@Test
	public void validLoginTest() {
		User u = new User("test", "password", 10);
		assertTrue(u.login("test", "password"));
	}
	
	@Test(expected = InvalidCredentialsException.class)
	public void invalidUsernameTest() {
		User u = new User("test", "password", 10);
		u.login("tester", "password");
	}
	
	@Test(expected = InvalidCredentialsException.class)
	public void invalidPasswordTest() {
		User u = new User("test", "password", 10);
		u.login("test", "pass");
	}
	
	@Test
	public void sufficientFundsTest() {
		User u = new User("test", "password", 10);
		int remaining = u.pay(5);
		assertEquals(5, remaining);
	}
	
	@Test(expected = InsufficientFundsException.class)
	public void insufficientFundsTest() {
		User u = new User("test", "password", 10);
		u.pay(15);
	}
}
