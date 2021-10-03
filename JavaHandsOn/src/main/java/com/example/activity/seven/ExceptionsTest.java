package com.example.activity.seven;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionsTest {
	
	@Test
	public void validLoginTest() throws InvalidCredentialsException {
		User u = new User("abcd", "password", 10);
		assertTrue(u.login("abcd", "password"));
	}

	@Test(expected = InvalidCredentialsException.class)
	public void invalidUsernameTest() throws InvalidCredentialsException {
		User u = new User("wxyz", "password", 10);
		u.login("abcd", "password");
	}
	
	@Test(expected = InvalidCredentialsException.class)
	public void invalidPasswordTest() throws InvalidCredentialsException {
		User u = new User("abcd", "password", 10);
		u.login("abcd", "pass");
	}
	
	@Test
	public void sufficientFundsTest() throws InsufficientFundsException {
		User u = new User("abcd", "password", 10);
		int remaining = u.pay(5);
		assertEquals(5, remaining);
	}
	
	@Test(expected = InsufficientFundsException.class)
	public void insufficientFundsTest() throws InsufficientFundsException {
		User u = new User("abcd", "password", 10);
		u.pay(15);
	}
	
}
