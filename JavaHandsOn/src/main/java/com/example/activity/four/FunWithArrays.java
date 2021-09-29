package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		a = a*a;
		b = b*b; 
		c = c*c;
		d = d*d;
		
		int[] arr = {a,b,c,d};
		
		//This should be modified to return the correct array
		return arr;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int total = 0;
		
		for(int num : nums)
		{
			total += num;
		}
		
		//This should be modifed to return the correct number
		return total;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		
       double total = 0;
		
		for(double num : nums)
		{
			total += num;
		}
		
		double average = total/nums.length;
		//This should be modified to return the correct number
		return average;
	}
	
}
