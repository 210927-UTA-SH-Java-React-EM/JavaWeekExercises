package com.example.activity.four;

import com.example.activity.one.Foo;

public class FunWithArrays {
	
	public int[] squares(int a, int b, int c, int d) {
		//Given the four inputs, square them, and put them in an array to return
		int[] inputArr = {a, b, c, d};
		int len = inputArr.length;
		int[] outputArr = new int[4];
		for (int i = 0; i < len; i++) {
			outputArr[i] = inputArr[i] * inputArr[i];
		}
		
		return outputArr;
	}
	
	private int pow(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int arraySum(int[] nums) {
		//Return the sum of the numbers inside of the given array
		int len = nums.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += nums[i];
		}
		
		return sum;
	}
	
	public double arrayAverage(double[] nums) {
		//Return the average of the numbers given in the array
		int len = nums.length;
		double le = len;
		double sum = 0.0;
		for (int i = 0; i < len; i++) {
			sum += nums[i];
		}
		
		return sum/le;
	}
	
	public static void main(String[] args) {
		FunWithArrays obj = new FunWithArrays();
		System.out.println("\n---- Test squares() ----");
		int[] sqArr = obj.squares(2, 4, 6, 8);
		for (int i = 0; i < 4; i++) {
			System.out.println(sqArr[i]);
		}
		
		System.out.println("\n---- Test arraySum() ----");
		int[] inputArr = {2, 4, 6};
		System.out.println(obj.arraySum(inputArr));		
		
		System.out.println("\n---- arrayAverage() ----");
		double[] dArray = {1.1, 2.2, 3.3, 4.4};
		System.out.println(obj.arrayAverage(dArray));
		
	}
	
}
