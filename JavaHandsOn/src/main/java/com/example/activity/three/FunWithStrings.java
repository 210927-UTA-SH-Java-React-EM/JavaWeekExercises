package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		int result = -1;
		String str = input.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
					str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				result = i;
				break;
			}
		}
		
		//This should be modified to return the correct char
		return result;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		String str = input.replaceAll(" ", "-");
		
		//This should be modified to return the correct string
		return str;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		boolean result = input.toLowerCase().contains(word.toLowerCase());
		
		//This should be modified to return the correct boolean
		return result;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		String str = input.toLowerCase();
		int j = str.length() - 1;
		boolean result = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(j)) {
				result = false;
			}
			j--;
		}
		
		//This should be modified to return the correct boolean
		return result;
	}
	
}
