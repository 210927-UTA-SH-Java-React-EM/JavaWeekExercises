package com.example.activity.two;

public class ControlFlowActivity {
	
	public String fooBar(int input) {
		//Fill out the method below that returns a specific String depending on the input
		//The method should return foo if the input is divisible by 3
		//The method should return bar if the input is divisible by 5
		//The method should return buz if the input is divisible by both 3 and 5
		//HINT use the modulos operator to determine the divisibility of the input
		
		if(input%5 == 0) {
			
			if(input %3==0) {
				return "buz";
			}
			else {
				return "bar";
			}
			
		}
		else if(input%3==0) {
			if(input%5==0) {
				return "buz";
			}
			else {
				return "foo";
			}
		}
		
		return "This should return the correct output";
	}
	
	public int sumOfEvens() {
		//Fill out the method below that adds up all of the even numbers from 1 to 100
		//Use a for loop to achieve this
		
		int x =0;
		
		for(int i =1;i<101;i++) {
			
			if(i%2==0) {
				x = i+x;
			}
		}
		
		//This should be changed to return the correct output
		return x;
	}
	
	public int sumOfNumbers(int input) {
		//Fill out the method below that adds up all the numbers from 1 to the given input using a while loop
		
		int y = 0;
		
		for(int i =1;i<input+1;i++) {
			
				y = i+y;
		}
		
		//This should be changed to return the correct output
		return y;
	}

}
