package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		
		for(int i=0; i<input.length(); i++) {
			
			switch(input.charAt(i)) {
			
			case 'a': return i;
			    
			case 'e': return i;
			          
			case 'i': return i;
		
			case 'o': return i;
	
			case 'u': return i;
			                  
			}
		}
		//This should be modified to return the correct char
		
		return -1;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		
		String replacement = input.replaceAll(" ", "-");
		
		//This should be modified to return the correct string
		
		return replacement;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		
		String lowercase = input.toLowerCase();
		
		//This should be modified to return the correct boolean
		
		return lowercase.contains(word);
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		
		for (int i=0;i<input.length()/2; i++) {
			
			if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
				
			 return false;
				
			}
		}
		
		//This should be modified to return the correct boolean
		return true;
	}
	
}
