package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		int[] input = {a, b, c, d};
		int[] output = new int[4];
		for (int i = 0; i < input.length; i++) {
			output[i] = input[i] * input[i];
		}
//		int[] output = new int[4];
//		output[0] = a*a;
//		output[1] = b*b;
//		output[2] = c*c;
//		output[3] = d*d;
		
		//This should be modified to return the correct array
		return output;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int acc = 0;
		for (int i : nums) {
			acc += i;
		}
		//This should be modifed to return the correct number
		return acc;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double acc = 0.0;
		double avg = 0.0;
		for (double d : nums) {
			acc += d;
		}
		avg = acc / nums.length;
		//This should be modified to return the correct number
		return avg;
	}
	
}
