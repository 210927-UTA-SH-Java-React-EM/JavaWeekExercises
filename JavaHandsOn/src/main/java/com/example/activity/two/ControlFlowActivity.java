package com.example.activity.two;

public class ControlFlowActivity {
	
	public String fooBar(int input) {
		//Fill out the method below that returns a specific String depending on the input
		//The method should return foo if the input is divisible by 3
		if(input % 3 == 0 && input % 5 != 0) {
			return "foo";
		}
		//The method should return bar if the input is divisible by 5
		else if(input % 5 == 0 && input % 3 != 0) {
			return "bar";
		}		
		//The method should return buz if the input is divisible by both 3 and 5
		else if(input % 3 == 0 && input % 5 == 0) {
			return "buz";
		}
		//HINT use the modulos operator to determine the divisibility of the input

		return "This should return the correct output";
	}
	
	public int sumOfEvens() {
		//Fill out the method below that adds up all of the even numbers from 1 to 100
		//Use a for loop to achieve this
		int n;
		n = 0;
		for(int i = 2; i <= 100; i = i +2) {
			n = n + i;
		}
		//This should be changed to return the correct output
		return n;
	}
	
	public int sumOfNumbers(int input) {
		//Fill out the method below that adds up all the numbers from 1 to the given input using a while loop
		int n;
		n = 0;
		for(int i = 1; i <= input; i++) {
			n = n + i;
		}
		
		//This should be changed to return the correct output
		return n;
	}

}
