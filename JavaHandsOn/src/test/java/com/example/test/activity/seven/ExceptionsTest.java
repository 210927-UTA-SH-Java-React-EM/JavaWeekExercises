package com.example.test.activity.seven;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.seven.InsufficientFundsException;
import com.example.activity.seven.InvalidCredentialsException;
import com.example.activity.seven.T;

public class ExceptionsTest {

	@Test
	public void validLoginTest() {
		T u = new T("test", "password", 10);
		assertTrue(u.login("test", "password"));
	}
	
	@Test(expected = InvalidCredentialsException.class)
	public void invalidUsernameTest() {
		T u = new T("test", "password", 10);
		u.login("tester", "password");
	}
	
	@Test(expected = InvalidCredentialsException.class)
	public void invalidPasswordTest() {
		T u = new T("test", "password", 10);
		u.login("test", "pass");
	}
	
	@Test
	public void sufficientFundsTest() {
		T u = new T("test", "password", 10);
		int remaining = u.pay(5);
		assertEquals(5, remaining);
	}
	
	@Test(expected = InsufficientFundsException.class)
	public void insufficientFundsTest() {
		T u = new T("test", "password", 10);
		u.pay(15);
	}
}
