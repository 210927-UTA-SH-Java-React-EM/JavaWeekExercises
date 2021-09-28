package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		int result = -1;
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		for (int i = 0; i < input.length(); i++)
		{
			switch (input.charAt(i))
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					return i;
				default: 
					break;
			}
		}
		
		//This should be modified to return the correct char
		return result;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		String result = input.replaceAll(" ", "-");
		
		//This should be modified to return the correct string
		return result;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		return input.toLowerCase().contains(word);
		
		//This should be modified to return the correct boolean
		// return false;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		int half = input.length();
		boolean result = true;
		
		for (int i = 0; i < half; i++)
		{
			if ( input.charAt(i) != input.charAt(input.length() - 1 - i))
			{
				result = false;
				break;
			}
		}
		
		//This should be modified to return the correct boolean
		return result;
	}
	
}
