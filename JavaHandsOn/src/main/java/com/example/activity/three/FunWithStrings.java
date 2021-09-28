package com.example.activity.three;


public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public char getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		for (int i = 0; i < input.length(); i++){
			char c = input.charAt(i);

			if (c == 'a'){
				return ((char) i);
			}if (c == 'e'){
				return ((char) i);
			}if (c == 'i'){
				return ((char) i);
			}if (c == 'o'){
				return ((char) i);
			}if (c == 'u'){
				return ((char) i);
			}
		}
		
		//This should be modified to return the correct char
		return '0';
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		String results = input.replaceAll(" ","-");
		
		//This should be modified to return the correct string
		return results;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		boolean results = input.contains(word.toLowerCase());
		//This should be modified to return the correct boolean
		return results;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		for (int i = 0; i < input.length(); i++){
			for (int x = input.length(); x < 0; x--){
				if (i != x){
					return false;
				}
			}
		}
		//This should be modified to return the correct boolean
		return true;
	}
	
}
