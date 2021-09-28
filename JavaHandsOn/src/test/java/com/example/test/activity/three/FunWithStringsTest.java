package com.example.test.activity.three;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.three.FunWithStrings;

public class FunWithStringsTest {
	
	public FunWithStrings fws = new FunWithStrings();
	
	@Test
	public void getFirstVowelTest1() {
		int firstVowel = fws.getFirstVowel("Hello World");
		assertEquals(1, firstVowel);
	}
	
	@Test
	public void getFirstVowelTest2() {
		int firstVowel = fws.getFirstVowel("dfjnmkrdjfisdeahnd");
		assertEquals(10, firstVowel);
	}
	
	@Test
	public void getFirstVowelTest3() {
		int firstVowel = fws.getFirstVowel("dfjnmkrdjfsdhnd");
		assertEquals(0, firstVowel);
	}
	
	@Test
	public void replaceAllSpacesTest1() {
		String replacedSpaces = fws.replaceAllSpaces("Hello World");
		assertTrue(replacedSpaces.equals("Hello-World"));
	}
	
	@Test
	public void replacAllSpacesTest2() {
		String replacedSpaces = fws.replaceAllSpaces("It's the end of the world as we know it!");
		assertTrue(replacedSpaces.equals("It's-the-end-of-the-world-as-we-know-it!"));
	}
	
	@Test
	public void replacAllSpacesTest3() {
		String replacedSpaces = fws.replaceAllSpaces("And I feel fine!");
		assertTrue(replacedSpaces.equals("And-I-feel-fine!"));
	}
	
	@Test
	public void containsWordTest1() {
		boolean containsWord = fws.containsWord("Hello World", "world");
		assertTrue(containsWord);
	}
	
	@Test
	public void containsWordTest2() {
		boolean containsWord = fws.containsWord("ThiS IS sOme CRAZy TeXT", "crazy");
		assertTrue(containsWord);
	}
	
	@Test
	public void containsWordTest3() {
		boolean containsWord = fws.containsWord("Some may get some lucky points on this one", "hello");
		assertFalse(containsWord);
	}
	
	@Test
	public void isPalindromeTest1() {
		boolean palindrome = fws.isPalindrome("tacocat");
		assertTrue(palindrome);
	}
	
	@Test
	public void isPalindromeTest2() {
		boolean palindrome = fws.isPalindrome("not a palidrome");
		assertFalse(palindrome);
	}

}
