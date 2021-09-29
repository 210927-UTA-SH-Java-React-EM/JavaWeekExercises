package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		int a2 = a*a;
		int b2 = b*b;
		int c2 = c*c;
		int d2 = d*d;
		
		int squareArray[] = new int[] {a2, b2, c2, d2};
		
		//This should be modified to return the correct array
		return squareArray;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int addVal = 0;
		for(int i = 0; i < nums.length ; i++)
		{
			addVal = addVal + nums[i];
		}
		//This should be modifed to return the correct number
		return (addVal);
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double addVal = 0;
		double avr = 0;
		for(int i = 0; i < nums.length ; i++)
		{
			addVal = addVal + nums[i];
		}
		
		avr = addVal/nums.length;
		
		//This should be modified to return the correct number
		return avr;
	}
	
}
