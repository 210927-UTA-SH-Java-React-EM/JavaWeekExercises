package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		int[] i = {a, b, c, d};
		for(int f = 0; f <= i.length - 1; f++) {
			i[f] = i[f] * i[f];
		}
		
		//This should be modified to return the correct array
		return i;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int sum = 0;
		
		for(int i = 0; i <= nums.length-1; i++) {
			sum += nums[i];
		}
		
		
		//This should be modifed to return the correct number
		return sum;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double avg = 0;
		double total = 0;
		
		for(int i = 0; i <= nums.length-1; i++) {
			total += nums[i];
		}
		
		avg = total/nums.length;
		//This should be modified to return the correct number
		return avg;
	}
	
}
