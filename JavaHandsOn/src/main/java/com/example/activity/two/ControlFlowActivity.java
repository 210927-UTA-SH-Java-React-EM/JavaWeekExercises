package com.example.activity.two;

public class ControlFlowActivity {
	
	public String fooBar(int input) {
		//Fill out the method below that returns a specific String depending on the input
		//The method should return foo if the input is divisible by 3
		//The method should return bar if the input is divisible by 5
		//The method should return buz if the input is divisible by both 3 and 5
		//HINT use the modulos operator to determine the divisibility of the input
		
		if(input % 3 == 0 && input % 5 == 0)
		{
			return "buz";	
		}
		if(input % 3 == 0)
		{
			return "foo";	
		}
		if(input % 5 == 0)
		{
			return "bar";	
		}
		
		return "";
		
	}
	
	public int sumOfEvens() {
		//Fill out the method below that adds up all of the even numbers from 1 to 100
		//Use a for loop to achieve this
		int x = 0;
		for(int i=2;i<=100;i++ )
		{
			if(i%2 == 0)
			{
		      x+=i;		
			}
			
		}
		
		
		
		//This should be changed to return the correct output
		return x;
	}
	
	public int sumOfNumbers(int input) {
		//Fill out the method below that adds up all the numbers from 1 to the given input using a while loop
         
		int x = 1;
		int m = 0;
		
		while(x<=input)
		{
		   m = m+x;	
		  x++;	
		}
		//This should be changed to return the correct output
		return m;
	}

}
