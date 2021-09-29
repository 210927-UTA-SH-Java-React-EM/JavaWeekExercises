package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		int isAVowel = 0;
		int isNotAVowel = -1;
		//assuming we want to return the first occurrence of a vowel, this will return the index of the first occurrence
		for(int i = 0; i < input.length(); i++) {
			switch(input.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				isAVowel = i;
				return isAVowel;
			}
		}
		
		
		//This should be modified to return the correct char
		return isNotAVowel;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		String replaceSpaces = input.replaceAll(" ",  "-");
		
		//This should be modified to return the correct string
		return replaceSpaces;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		String lowerCased = input.toLowerCase();
		boolean containsWord = lowerCased.contains(word);
		//This should be modified to return the correct boolean
		return containsWord;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		int length = input.length() / 2;
		for(int i = 0; i < length; i++) {
			if(input.charAt(i) != input.charAt(input.length() - i - 1)) {
				return false;
			}
		}
		//This should be modified to return the correct boolean
		return true;
	}
	
}
