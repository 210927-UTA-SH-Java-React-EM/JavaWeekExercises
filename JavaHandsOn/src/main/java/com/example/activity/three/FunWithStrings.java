package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public char getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		char[] c= {'a','e','i','o','u'};
		char ans = 0;
		for(int i=0;i<input.length();i++)
		{
			for(int j=0;j<5;j++)
			{
				if(input.charAt(i)==c[j])
				{
					ans=c[j];
				}
			}
			
		}
		//This should be modified to return the correct char
		return ans;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		
		String str=input.replaceAll("\s", "-");
	
		//This should be modified to return the correct string
		return str;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
	
		boolean compare=input.toLowerCase().contains(word);
				
		//This should be modified to return the correct boolean
		return compare;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		int length = input.length();
		 String s="";
		 boolean b;
	      for ( int i = length - 1; i >= 0; i-- )
	         s = s + input.charAt(i);
	 
	      if (input.equals(s))
	         b=true;
	      else
	         b=false;
	 
		//This should be modified to return the correct boolean
		return b;
	}
	
}
