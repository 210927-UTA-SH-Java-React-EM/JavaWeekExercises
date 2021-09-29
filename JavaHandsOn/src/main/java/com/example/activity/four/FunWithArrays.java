package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		int[] nums = {a, b, c, d};
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		
		//This should be modified to return the correct array
		return nums;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int sum = 0;
		for (int i: nums) {
			sum += i;
		}
		
		//This should be modifed to return the correct number
		return sum;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double average = 0.0;
		for (double n : nums) {
			average += n;
		}
		average /= nums.length;
		
		//This should be modified to return the correct number
		return average;
	}
	
}
