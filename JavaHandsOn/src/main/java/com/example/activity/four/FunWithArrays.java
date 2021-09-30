package com.example.activity.four;

import java.lang.Math;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		int[] squaredArray = new int [4];
		squaredArray[0] = a*a;
		squaredArray[1] = b*b;
		squaredArray[2] = c*c;
		squaredArray[3] = d*d;
		//This should be modified to return the correct array
		return squaredArray;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int sum = 0;
		for(int i = 0; i < nums.length;i++)
		{
			sum += nums[i];
		}
		//This should be modifed to return the correct number
		return sum;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double sum = 0;
		double average = 0;
		for(int i = 0; i < nums.length; i++)
		{
			sum += nums[i];
		}
		//This should be modified to return the correct number
		
		average = sum / nums.length;
		return average;
	}
}