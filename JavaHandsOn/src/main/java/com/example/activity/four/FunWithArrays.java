package com.example.activity.four;


public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		return new int[] {a*a, b*b, c*c, d*d};
		
		//This should be modified to return the correct array
		// return new int[4];
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int result = 0;
		for(int n: nums) { result += n; }
		
		//This should be modifed to return the correct number
		return result;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double result = 0;
		for(double n: nums) { result += n; }
		//This should be modified to return the correct number
		
		return result/nums.length;
	}
	
}
