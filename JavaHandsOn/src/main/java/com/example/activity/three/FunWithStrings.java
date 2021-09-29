package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		int i = 0;
		int j = input.length() - 1;
		String str = input.toLowerCase();
		int val = 0;
		
		while(i <= j)
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				return i;
			}
			
			i++;
		}
		
		
		//This should be modified to return the correct char
		return (-1);
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		String oldStr = input;
		String newStr = oldStr.replaceAll(" ", "-");
		
		//This should be modified to return the correct string
		return newStr;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
	    String str = input.toLowerCase();
	    boolean val = false;
		
		if (str.contains(word) == true)
	    {
	    	val = true;
	    }
		
		//This should be modified to return the correct boolean
		return val;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		int i = 0;
		int j = input.length() - 1;
		
		while (i < j)
		{
			if (input.charAt(i) != input.charAt(j))
			{
				return false;
			}
			
			i++;
			j--;
		}
		
		//This should be modified to return the correct boolean
		return true;
	}
	
}
