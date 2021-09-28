package com.example.activity.two;

public class ControlFlowActivity {
	
	public String fooBar(int input) {
		//Fill out the method below that returns a specific String depending on the input
		//The method should return foo if the input is divisible by 3
		//The method should return bar if the input is divisible by 5
		//The method should return buz if the input is divisible by both 3 and 5
		//HINT use the modulos operator to determine the divisibility of the input
		if (input % 3 == 0){
			if (input % 5 == 0){
				return "buz";
			}else {
				return "foo";
			}
		}else if (input % 5 == 0){
			return "bar";
		}
		
		return "This should return the correct output";
	}
	
	public int sumOfEvens() {
		//Fill out the method below that adds up all of the even numbers from 1 to 100
		//Use a for loop to achieve this
		int result = 0;
		for (int i = 1; i <= 100; i++ ){
			if (i % 2 == 0) result +=i;
		}
		//This should be changed to return the correct output
		return result;
	}
	
	public int sumOfNumbers(int input) {
		//Fill out the method below that adds up all the numbers from 1 to the given input using a while loop
		int result = 0;
		for (int i = 1; i <= input; i++ ){
			result +=i;
		}
		//This should be changed to return the correct output
		return result;
	}

}
