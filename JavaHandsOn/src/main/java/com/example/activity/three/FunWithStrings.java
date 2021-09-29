package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		for(int i = 0; i < input.length(); i++) {
			if(i > input.length()) {
				return -1;
			}else if(input.charAt(i) == 'a') {
				return input.charAt(i);
			}else if(input.charAt(i) == 'e') {
				return input.charAt(i);
			}else if(input.charAt(i) == 'i') {
				return input.charAt(i);
			}else if(input.charAt(i) == 'o') {
				return input.charAt(i);
			}else if(input.charAt(i) == 'u') {
				return input.charAt(i);
			}else{
				continue;
			}
			
		}
		//This should be modified to return the correct char
		return '0';
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		String a = input.replace(" ", "-");
		
		//This should be modified to return the correct string
		return a;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		if(input.toLowerCase().contains(word)) {
			return true;
		}
		//This should be modified to return the correct boolean
		return false;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		int i = 0;
		while(i <= input.length()/2) {
			if(input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				i++;
				return false;		
			}		
		}
		//This should be modified to return the correct boolean
		return true;
		}
		
}
