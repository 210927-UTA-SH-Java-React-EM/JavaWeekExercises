package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		int first = 0;
		boolean flag = false;
		String vowels = "aeiou";
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if(input.charAt(i) == vowels.charAt(j)) flag = true;
			}
//			first++;
//		    if(input.length() -1 == first) first = -1;
			first = input.length() -1 == i? -1 : i;
			if(flag) break;		    
		}
		//This should be modified to return the correct char
		return first;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		String correct = "";
		correct = input.replaceAll(" ", "-");
		
		//This should be modified to return the correct string
		return correct;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		String lower = "";
		lower = input.toLowerCase();
		boolean result = false;
		result = lower.contains(word);
		//This should be modified to return the correct boolean
		return result;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palindrome
		boolean result = false;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == input.charAt(input.length() -(i+1))) {
				result = true;
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
