package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		int[] x = new int[4];
		x[0] = a*a;
		x[1] = b*b;
		x[2] = c*c;
		x[3] = d*d;

		
		//This should be modified to return the correct array
		return x;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int sum = 0;
		for (int x : nums){
			sum +=x;
		}
		//This should be modifed to return the correct number
		return sum;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double sum = 0;
		for (double x : nums){
			sum +=x;
		}
		//This should be modified to return the correct number
		return sum/nums.length;
	}
	
}
