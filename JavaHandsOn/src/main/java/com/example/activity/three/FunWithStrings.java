package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public char getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		int result = 0;
		
		
		for (int i = 0; i <= input.length(); i++) {
			
			if (input.charAt(i) == ('a'|'e'|'i'|'o'|'u')) {
				result = i;
				break;
			}
		}
		
		//This should be modified to return the correct char
		return Integer.toString(result);
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		String result = null;
		
		result = input.replaceAll(" ", "-");
		
		//This should be modified to return the correct string
		return result;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		boolean result = false;
		
		if((input.toLowerCase()).contains(word)) {
			result = true;
		}
		else {
			result = false;
		}
		
		//This should be modified to return the correct boolean
		return result;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		boolean result  = false;
		int first = 0;
		int last = input.length() -1;
		
		while(first < last) {
				if (input.charAt(first) == input.charAt(last)) {
					result = true;
					first++;
					last--;
				}
				else {
					result = false;
					break;
				}
		}
		//This should be modified to return the correct boolean
		return result;
	}
	
}
