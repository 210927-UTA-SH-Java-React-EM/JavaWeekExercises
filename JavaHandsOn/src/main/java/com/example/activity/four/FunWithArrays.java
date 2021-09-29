package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		
		a = a*a;
		b = b*b;
		c = c*c;
		d = d*d;
		
		int[] square = {a,b,c,d};
		
		//This should be modified to return the correct array
		return square;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int x = 0;
		
		for(int i = 0;i<nums.length;i++) {
			x=x+nums[i];
		}
		//This should be modifed to return the correct number
		return x;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double x = 0;
		
		for(int i = 0;i<nums.length;i++) {
			x=x+nums[i];
		}
		
		double result = x/nums.length; 
		//This should be modified to return the correct number
		return result;
	}
	
}
