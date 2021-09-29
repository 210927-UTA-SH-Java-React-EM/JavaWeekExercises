package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public char getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		
		input = input.toLowerCase();
		
		for(int i = 0;i<input.length();i++) {
			switch(input.charAt(i)) {
			case 'a':
				return input.charAt(i);
				
			case 'e':
				return input.charAt(i);
				
			case 'i':
				return input.charAt(i);
				
			case 'o':
				return input.charAt(i);
				
			case 'u':
				return input.charAt(i);
				
			default:
				continue;
					
			}
			
			
		}
		
		//This should be modified to return the correct char
		
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		
		
		//This should be modified to return the correct string
		return "";
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		
		//This should be modified to return the correct boolean
		return false;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		
		//This should be modified to return the correct boolean
		return false;
	}
	
}
