package com.example.activity.two;

import com.example.activity.one.Foo;

public class ControlFlowActivity {
	
	public String fooBar(int input) {
		//Fill out the method below that returns a specific String depending on the input
		//The method should return foo if the input is divisible by 3
		//The method should return bar if the input is divisible by 5
		//The method should return buz if the input is divisible by both 3 and 5
		//HINT use the modulos operator to determine the divisibility of the input
		String result = null;
		if (input % 3 == 0 && input % 5 == 0) {
			result = "buz";
		} else if (input % 3 == 0) {
			result = "foo";
		} else if (input % 5 == 0) {
			result = "bar";
		} else {
			result = "This input isn't going to work here";
		}
		return result;
	}
	
	public int sumOfEvens() {
		//Fill out the method below that adds up all of the even numbers from 1 to 100
		//Use a for loop to achieve this
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;				
			}			
		}
		return sum;
	}
	
	public int sumOfNumbers(int input) {
		//Fill out the method below that adds up all the numbers from 1 to the given input using a while loop
		//This should be changed to return the correct output
		int cum = 0;
		int max = input+1;
		for (int i = 0; i < max; i++) {
			cum += i;
		}
		return cum;
	}
	
	public static void main(String[] args) {
		ControlFlowActivity obj = new ControlFlowActivity();
		System.out.println("---- method foobar() ----");
	    System.out.println(obj.fooBar(9));
	    System.out.println(obj.fooBar(10));
	    System.out.println(obj.fooBar(15));
	    System.out.println(obj.fooBar(22));	    
	    
	    System.out.println("\n" + "---- method sumOfEvens() ----");
	    System.out.println(obj.sumOfEvens());

	    System.out.println("\n" + "---- method sumOfNumbers() ----");	    
	    System.out.println(obj.sumOfNumbers(3));
	    System.out.println(obj.sumOfNumbers(9));
	    System.out.println(obj.sumOfNumbers(10));
	    System.out.println(obj.sumOfNumbers(99));
	    System.out.println(obj.sumOfNumbers(100));
	}

}
