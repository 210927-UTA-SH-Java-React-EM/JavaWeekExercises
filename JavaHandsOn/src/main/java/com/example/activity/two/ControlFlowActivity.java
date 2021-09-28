package com.example.activity.two;

public class ControlFlowActivity {
	
	public String fooBar(int input) {
		//Fill out the method below that returns a specific String depending on the input
		//The method should return foo if the input is divisible by 3
		//The method should return bar if the input is divisible by 5
		//The method should return buz if the input is divisible by both 3 and 5
		//HINT use the modulus operator to determine the divisibility of the input
		String result = "";
		if (input % 3 == 0)
			{ 
				// divisible by 3 and 5, return buz
				if (input % 5 == 0) { result = "buz"; }
				// only divisible by 3, return foo
				else { result = "foo"; }
			}
		// only divisible by 5, return bar
		else if (input % 5 == 0) { result = "bar"; }
		
		return result;
	}
	
	public int sumOfEvens() {
		//Fill out the method below that adds up all of the even numbers from 1 to 100
		int result = 0;
		//Use a for loop to achieve this
		for (int i = 2; i < 101; i += 2)
		{
			result += i;
		}
		
		//This should be changed to return the correct output
		return result;
	}
	
	public int sumOfNumbers(int input) {
		int result = 0;
		int i = 0;
		//Fill out the method below that adds up all the numbers from 1 to the given input using a while loop
		while(i <= input)
		{
			result += i;
			// increment
			i++;
		}
		
		//This should be changed to return the correct output
		return result;
	}

}
