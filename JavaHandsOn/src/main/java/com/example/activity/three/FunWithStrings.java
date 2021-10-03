package com.example.activity.three;

import com.example.activity.one.Foo;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	//Note this changed fron char to int to enable return of -1
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		input = input.toLowerCase();
		int len = input.length();
		//int le = vowelsArr.length;		
		String vowels = "aeiou";
		int le = vowels.length();
		int res = -1;
		for (int i = 0; i < len; i++) {
			if (vowels.indexOf(input.charAt(i)) > -1) {
				res = i;
				break;
			}
		}
		
		return res;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'

		String newString = input.replaceAll(" ","-"); 
		return newString;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		
		if (input.toLowerCase().contains(word.toLowerCase())) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome

		int len = input.length();
	    int c = 0;
		while (c <= input.length()/2) {       
	        if (input.charAt(c) != input.charAt(len-1-c)) {
	            return false;
	        }        
	        c += 1;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		FunWithStrings obj = new FunWithStrings();
		System.out.println("---- Test getFirstVowel() ----");
		System.out.println(obj.getFirstVowel("Babarere"));
		System.out.println(obj.getFirstVowel("qwrtyh"));
		
		System.out.println("\n---- Test replaceAllSpaces() ----");
		System.out.println(obj.replaceAllSpaces("I am loving Java"));
		System.out.println(obj.replaceAllSpaces("Can you imaging NYC @ night"));
		
		System.out.println("\n---- Test containsWord() ----");
		if (obj.containsWord("Can yOU IMagINg NYc @ night", "nyC")) {
			System.out.println("Can yOU IMagINg NYc @ night contains nyC");
		} else {
			System.out.println("Can yOU IMagINg NYc @ night does not contains nyC");
		}
		
		if (obj.containsWord("Can yOU IMagINg NYc @ night", "hoUSTon")) {
			System.out.println("Can yOU IMagINg NYc @ night contains nyC");
		} else {
			System.out.println("Can yOU IMagINg NYc @ night does not contains hoUSTon");
		}
		
		System.out.println("\n---- Test isPalindrome() ----");
		if (obj.isPalindrome("redivider")) {
			System.out.println("redivider is a Palindrome word");
		} else {
			System.out.println("redivider is not a Palindrome word");
		}
		
		if (obj.isPalindrome("motor")) {
			System.out.println("motor is Palindrome word");
		} else {
			System.out.println("motor is not a Palindrome");
		}		

	}
	
}
