package com.example.test.activity.two;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.two.ControlFlowActivity;

public class ActivityTwoTest {
	
	ControlFlowActivity cfa = new ControlFlowActivity();
	
	@Test
	public void fooBarTest1() {
		String foo = cfa.fooBar(3);
		assertEquals("foo", foo);
	}
	
	@Test
	public void fooBarTest2() {
		String foo = cfa.fooBar(5);
		assertEquals("bar", foo);
	}
	
	@Test
	public void fooBarTest3() {
		String foo = cfa.fooBar(15);
		assertEquals("buz", foo);
	}
	
	@Test
	public void addEvensTest() {
		int num = cfa.sumOfEvens();
		assertEquals(2550, num);
	}
	
	@Test
	public void addNumbersTest1() {
		int num = cfa.sumOfNumbers(10);
		assertEquals(55, num);
	}
	
	@Test
	public void addNumbersTest2() {
		int num = cfa.sumOfNumbers(100);
		assertEquals(5050, num);
	}
	
	@Test
	public void addNumbersTest3() {
		int num = cfa.sumOfNumbers(1000);
		assertEquals(500500, num);
	}

}
