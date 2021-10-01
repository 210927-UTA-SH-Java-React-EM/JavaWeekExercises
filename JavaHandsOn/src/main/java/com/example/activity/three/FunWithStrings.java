package com.example.activity.three;

import java.util.Iterator;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		int result=-1;
		for (int i = 0; i<input.length()&result==-1;i++) {
			if(IsVowel(input.charAt(i))) {
				result = i;
			}	
		}
		//This should be modified to return the correct char
		return result;
	}
	
	public boolean IsVowel (char input) {
		if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u')
			return true;
		
		return false;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		input =input.replaceAll(" ", "-");
		
		
		//This should be modified to return the correct string
		return input;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		
		input=input.toLowerCase();
		word=word.toLowerCase();
		
		//This should be modified to return the correct boolean
		return input.contains(word);
	}
	
	public static boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		boolean palindrome = true;
		int length = input.length()-1;
		for (int i =0; i<input.length()&palindrome&i<length-i;i++) {
			if(!(input.charAt(i)==input.charAt(length-i))) {

				palindrome = false;
			}
				
			
		}
		
		//This should be modified to return the correct boolean
		return palindrome;
	}
	
	
}
