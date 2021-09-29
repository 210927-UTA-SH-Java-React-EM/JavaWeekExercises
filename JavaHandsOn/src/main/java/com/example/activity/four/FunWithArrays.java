package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		
		int[] intarr = new int[4];
		
		intarr[0] = a*a;
		intarr[1] = b*b;
		intarr[2] = c*c;
		intarr[3] = d*d;
		//This should be modified to return the correct array
		return intarr;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int sum =0;
		for(int i=0;i<nums.length;i++)
		{
			sum += nums[i];
		}
		//This should be modifed to return the correct number
		return sum;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
          
		double sum =0;
		for(int i=0;i<nums.length;i++)
		{
			sum += nums[i];
		}
		
		//This should be modified to return the correct number
		return (double) sum/nums.length;
	}
	
}
