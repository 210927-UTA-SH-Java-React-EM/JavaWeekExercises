package com.example.activity.two;

public class ControlFlowActivity {
	
	public String fooBar(int input) {
		//Fill out the method below that returns a specific String depending on the input
		//The method should return foo if the input is divisible by 3
		//The method should return bar if the input is divisible by 5
		//The method should return buz if the input is divisible by both 3 and 5
		//HINT use the modulos operator to determine the divisibility of the input
		
		if(input%3==0&& input%5==0) {
			return "buz";
		}else if(input%3==0) {
			return "foo";
		}else if (input%5==0) {
			return "bar";
		}else return "Not divisible by any";
		
	}
	
	public int sumOfEvens() {
		//Fill out the method below that adds up all of the even numbers from 1 to 100
		//Use a for loop to achieve this
		int stor = 0;
		//This should be changed to return the correct output
		for(int x = 0; x<101;x++) {
			if (x%2==0) {
				stor = stor+x;
			}
		}
		return stor;
	}
	
	public int sumOfNumbers(int input) {
		//Fill out the method below that adds up all the numbers from 1 to the given input using a while loop
int stor =0;
		while(input>0) {
stor = stor+input;
input--;
}
		
		//This should be changed to return the correct output
		return stor;
	}

}
