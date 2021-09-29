package com.example.activity.three;

public class FunWithStrings {
	
	//In this activity you will use your knowledge of control flow and string to complete the below methods
	
	public int getFirstVowel(String input) {
		//Using the .length() method and .charAt() method
		//Loop through the input text and return the first instance of a vowel (aeiou)
		//Should return -1 if no vowels present
		
		
		input = input.toLowerCase();
		input = input.replaceAll(" ", "");
		
		char[] inArr = input.toCharArray();
				
		for(int i = 0;i<inArr.length;i++) {
			switch(inArr[i]) {
				case 'a':
					System.out.println(i);
					return i;
						
				case 'e':
					System.out.println(i);
					return i;
						
				case 'i':
					System.out.println(i);
					return i;
						
				case 'o':
					System.out.println(i);
					return i;
						
				case 'u':
					System.out.println(i);
					return i;
						
				default:
					continue;
							
					}

				}
		
		//This should be modified to return the correct char
		return -1;
	}
	
	
	public String replaceAllSpaces(String input) {
		//Using the .replaceAll() method, replace all the spaces in the input text with '-'
		String str = input.replaceAll(" ", "-");
		
		//This should be modified to return the correct string
		return str;
	}
	
	
	public boolean containsWord(String input, String word) {
		//Expect the input to be crazy like this "InPUT iS noT UNIform"
		//Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
		input = input.toLowerCase();
		
		boolean containsW = input.contains(word);
		
		//This should be modified to return the correct boolean
		return containsW;
	}
	
	public boolean isPalindrome(String input) {
		//Use your knowledge of loops, and .charAt() to find out if the input is a palendrome
		input = input.replaceAll(" ", "");
		char[] inputArr = input.toCharArray();
		char[] palinArr = new char[input.length()];
		
		int x = 0;
		
		for(int i = inputArr.length-1;i > -1;i--) {
			palinArr[x] = inputArr[i];
			x++;
		}
		
		 input = String.valueOf(inputArr);
		 String palin = String.valueOf(palinArr);
		 
		 
		//This should be modified to return the correct boolean
		return input.equals(palin);
	}
	
}
