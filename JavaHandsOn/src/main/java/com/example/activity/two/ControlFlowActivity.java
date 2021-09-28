package com.example.activity.two;

public class ControlFlowActivity {
	
	public String fooBar(int input) {
		//Fill out the method below that returns a specific String depending on the input
		//The method should return foo if the input is divisible by 3
		//The method should return bar if the input is divisible by 5
		//The method should return buz if the input is divisible by both 3 and 5
		//HINT use the modulos operator to determine the divisibility of the input
		boolean fooFlag = (input % 3 == 0);
		boolean barFlag = (input % 5 == 0);
		String result = "Input is not divisible by either 3 or 5";
		if (fooFlag && barFlag) {
			result = "buz";
		} else if (fooFlag) {
			result = "foo";
		} else if (barFlag) {
			result = "bar";
		}
		
		return result;
	}
	
	public int sumOfEvens() {
		//Fill out the method below that adds up all of the even numbers from 1 to 100
		//Use a for loop to achieve this
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue;
			}
			sum += i;
		}
		
		//This should be changed to return the correct output
		return sum;
	}
	
	public int sumOfNumbers(int input) {
		//Fill out the method below that adds up all the numbers from 1 to the given input using a while loop
		int sum = 0;
		int num = 1;
		while (num <= input) {
			sum += num;
			num++;
		}
		
		
		//This should be changed to return the correct output
		return sum;
	}

}
