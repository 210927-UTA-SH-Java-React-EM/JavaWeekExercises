package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		int[] newArray = {a * a, b * b, c * c, d * d};
//		for ( int i = 0; i <= newArray.length; i++) {
//			newArray[i] = newArray[i] * newArray[i];
//		}
		
		//This should be modified to return the correct array
		return newArray;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int sum = 0;
		for (int el: nums) {
			sum += el;
		}
		//This should be modifed to return the correct number
		return sum;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double average = 0; 
		double sum = 0;
		for (double el: nums) {
			sum += el;
		}
		average = sum / nums.length;
		//This should be modified to return the correct number
		return average;
	}
	
}
