package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		return new int[] { a*a, b*b, c*c, d*d };
	}
	
	public int arraySum(int[] nums) {
		int sum = 0;
		for (int i : nums)
			sum += i;
		return sum;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		
		//This should be modified to return the correct number
		double avg = 0;
		for (double d : nums)
			avg += d;
		return avg / nums.length;
		
	}
	
}
