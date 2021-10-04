package src.main.java.com.example.activity.two;

public class ControlFlowActivity {
	
	public String fooBar(int input) {
		//Fill out the method below that returns a specific String depending on the input
		//HINT use the modulos operator to determine the divisibility of the input
		
		//The method should return buz if the input is divisible by both 3 and 5
		if(input%3==0 && input%5 == 0) 
			return "buz";
		
		//The method should return foo if the input is divisible by 3
		if(input%3==0) 
			return "foo";
		
		//The method should return bar if the input is divisible by 5
		if(input%5==0) 
			return "bar";
		
		return "This should return the correct output";
	}
	
	public int sumEvens() {
		//Fill out the method below that adds up all of the even numbers from 1 to 100
		//Use a for loop to achieve this
		
		int evenSum = 0;
		for(int j=1; j<101; j++)
		{
			if(j%2==0)
			{
				evenSum += j;
			}
		}
		//This should be changed to return the correct output
		return evenSum;
	}
	
	public int sumOfNumbers(int input) {
		//Fill out the method below that adds up all the numbers from 1 to the given input using a while loop
		int sumNums = 0;
		int i = 1;
		while(i<=input)
		{
			sumNums+=i++;
		}
		//This should be changed to return the correct output
		return sumNums;
	}

}
