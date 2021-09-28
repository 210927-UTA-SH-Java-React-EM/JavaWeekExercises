package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		
		int[] result = {a*a,b*b,c*c,d*d};
		
		//This should be modified to return the correct array
		return result;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int total=0;
		
		for (int i : nums) {
			total+=i;
		}
		
		//This should be modifed to return the correct number
		return total;
	}
	
	public double arraySumDouble(double[] nums) {
		//Return the sum of the numbers inside of the given array
		double total=0;
		
		for (double i : nums) {
			total+=i;
		}
		
		//This should be modifed to return the correct number
		return total;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		
		
		//This should be modified to return the correct number
		return arraySumDouble(nums)/nums.length;
	}
	
}
