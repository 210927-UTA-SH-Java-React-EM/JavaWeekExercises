package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		int lengthOfInput;
		StringBuilder sb = new StringBuilder();
		int vowelAt = 0;
		lengthOfInput = input.length();
		for(int i = 0; i<lengthOfInput;i++)
		{
			sb.append(input.charAt(i));
			if(input.charAt(i) == 'a' ||input.charAt(i) == 'e' ||input.charAt(i) == 'i'||input.charAt(i) == 'o' ||input.charAt(i) == 'u')
			{
				vowelAt = sb.length() - 1;
				return vowelAt;
			}
		}
		return -1;
		//This should be modified to return the correct char
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		String replaced = input.replaceAll(" ", "-");
		//This should be modified to return the correct string
		return replaced;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		boolean bool;
		input = input.toLowerCase();
		word = word.toLowerCase();
		if(input.contains(word))
		{
			return true;
		}
		//This should be modified to return the correct boolean
		return false;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		int reverseString;
		reverseString = input.length();
		for(int i = 0; i<input.length()/2; i++)
		{
			//System.out.println(reverseString);
			//System.out.println(input.charAt(i));
			//System.out.println(input.charAt(reverseString - 1));
			if(input.charAt(i) == input.charAt(reverseString - 1))
			{
				reverseString -= 1;
			}
			else return false;
		}
		return true;
	}
	


public static void main(String args[])
	{
	FunWithStrings Test = new FunWithStrings();
	//System.out.println(Test.getFirstVowel("fffdddefff"));
	//System.out.println(Test.replaceAllSpaces("Four score and seven years ago"));
	//System.out.println(Test.containsWord("FincH", "Aretha"));
	//System.out.println(Test.isPalindrome("detartrated"));
	}
}
