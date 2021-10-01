package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		
		
		
		input = input.toLowerCase();
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'|| input.charAt(i)=='u') {
				return i;
				
			};
		}
		//This should be modified to return the correct char
		return -1;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		input = input.replaceAll(" ", "-");
	
		//This should be modified to return the correct string
		return input;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		input = input.toLowerCase();
		
		//This should be modified to return the correct boolean
		if (input.contains(word)) {
			return true;
		}return false;
	}
	
	public boolean isPalindrome(String input) {
		 boolean isPalin = false;
	
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		
		//I tried a few things but it doesn't seem to go into the if block of my statement
		
		//why doesn't this work as returning a boolean?
		
		for(int i =0; i>=input.length();i++) {
		
			
		}
		//This should be modified to return the correct boolean
		
		
	}
	
}
