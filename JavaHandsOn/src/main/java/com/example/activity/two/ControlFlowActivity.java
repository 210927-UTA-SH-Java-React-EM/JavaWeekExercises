package com.example.activity.two;

public class ControlFlowActivity {
	
	public String fooBar(int input) {
		//Fill out the method below that returns a specific String depending on the input
		//The method should return foo if the input is divisible by 3
		//The method should return bar if the input is divisible by 5
		//The method should return buz if the input is divisible by both 3 and 5
		//HINT use the modulos operator to determine the divisibility of the input
		String s;
		if(input%3==0) 
			s="foo";
		else if(input%5==0)
			s="bar";
		else if(input%15==0)
			s="buz";
		else 
			s="input can not be dibvisible by 3 or/and 5";
		return s;
	}
	
	

	public int sumOfEvens() {
		//Fill out the method below that adds up all of the even numbers from 1 to 100
		//Use a for loop to achieve this
		int j=0;
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				
				j+=i;
			}
		}
		
		//This should be changed to return the correct output
		return j;
	}
	
	public int sumOfNumbers(int input) {
		//Fill out the method below that adds up all the numbers from 1 to the given input using a while loop
		int j=0;
		for(int i=0;i<=input;i++)
		{
				
				j+=i;
		}
		
		//This should be changed to return the correct output
		return j;
	}

}
