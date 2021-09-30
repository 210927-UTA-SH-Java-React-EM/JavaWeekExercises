package com.example.activity.four;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		int[] result ={'a','b','c','d'};;
		 
		for(int i=0; i<4;i++)
		{
			result[i]=result[i]*result[i];
		}
		
		//This should be modified to return the correct array
		return result;
	}
	
	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int sum=0;
		int l=nums.length;
		for(int i=0; i<l;i++)
		{
			sum+=nums[i];
		}
		
		//This should be modifed to return the correct number
		return sum;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		double sum=0.0;
		double l=nums.length;
		for(int i=0; i<l;i++)
		{
			sum+=nums[i];
		}
		double avg=sum/l;
		//This should be modified to return the correct number
		return avg;
	}
	
}
