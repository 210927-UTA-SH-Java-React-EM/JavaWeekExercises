package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		
		int length = input.length();
		int index = 0;
		for(int i = 0; i<=length; i++)
		{
			switch(input.charAt(i)) {
			case 'a':
				index = i;
			break;
			case 'e':
				index = i;
			break;
			case 'i':
				index = i;
			break;
			case 'o':
				index = i;
		    break;
			case 'u':
				index = i;
			break;
			default:
				index = -1;
			}		
		}
		//This should be modified to return the correct char
		return index;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		
		String dash = input.replaceAll(" ", "-");
		
		//This should be modified to return the correct string
		return dash;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		String lowerInput = input.toLowerCase();
		if(lowerInput.contains(word))
		{
			return true;
		}
		//This should be modified to return the correct boolean
		return false;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		int length = input.length()-1;
		String newInput = "";
		for(int i = length; i<-1; i-- )
		{
			newInput += input.charAt(i);
		}
		
		if(newInput==input) {
			return true;
		}
		//This should be modified to return the correct boolean
		return false;
	}
	
}
