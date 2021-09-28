package com.example.activity.three;


public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		for (int i = 0; i < input.length(); i++){
			char c = input.charAt(i);

			if (c == 'a'){
				return i;
			}if (c == 'e'){
				return i;
			}if (c == 'i'){
				return i;
			}if (c == 'o'){
				return i;
			}if (c == 'u'){
				return i;
			}
		}
		
		//This should be modified to return the correct char
		return -1;
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
		//This should be modified to return the correct boolean
		return input.toLowerCase().contains(word.toLowerCase());
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		int i = input.length()-1;
		int x = 0;
		while (i > x){
			if (input.charAt(i) != input.charAt(x)){
				return false;
			}
			i--;
			x++;
		}
		//This should be modified to return the correct boolean
		return true;
	}
	
}
