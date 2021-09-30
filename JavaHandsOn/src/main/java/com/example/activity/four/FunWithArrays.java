package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		int [] result = new int [4];
		
		result[0] = a*a;
		result[1] = b*b;
		result[2] = c*c;
		result[3] = d*d;
		
		//This should be modified to return the correct array
		return result;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int result = 0;
		
		for (Integer number: nums) {
			result += number;
		}
		
		//This should be modifed to return the correct number
		return result;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double result = 0.0;
		
		for(Double number: nums) {
			result += number;
		}
		result = result / nums.length;
		
		//This should be modified to return the correct number
		return result;
	}
	
}
