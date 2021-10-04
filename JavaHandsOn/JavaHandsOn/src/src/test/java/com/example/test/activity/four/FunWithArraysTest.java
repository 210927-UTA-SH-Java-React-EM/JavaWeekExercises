package com.example.test.activity.four;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.four.FunWithArrays;

public class FunWithArraysTest {
	
	public FunWithArrays fwa = new FunWithArrays();
	
	@Test
	public void squaresTest1() {
		int arr[] = fwa.squares(1, 2, 3, 4);
		assertEquals(1, arr[0]);
		assertEquals(4, arr[1]);
		assertEquals(9, arr[2]);
		assertEquals(16, arr[3]);
	}
	
	@Test
	public void squaresTest2() {
		int arr[] = fwa.squares(33, 14, 8, 29);
		assertEquals(1089, arr[0]);
		assertEquals(196, arr[1]);
		assertEquals(64, arr[2]);
		assertEquals(841, arr[3]);
	}
	
	@Test
	public void arraySumTest1() {
		int arr[] = {1,2,3,4};
		int sum = fwa.arraySum(arr);
		assertEquals(10, sum);
	}
	
	@Test
	public void arraySumTest2() {
		int arr[] = {15,39,4,11};
		int sum = fwa.arraySum(arr);
		assertEquals(69, sum);
	}
	
	@Test
	public void arrayAverageTest1() {
		double arr[] = {5.0, 9.0, 4.0, 11.0};
		double avg = fwa.arrayAverage(arr);
		assertEquals(7.25, avg, 0.01);
	}
	
	@Test
	public void arrayAverageTest2() {
		double arr[] = {19.0, 2.5, 53.0, 13.0};
		double avg = fwa.arrayAverage(arr);
		assertEquals(21.875, avg, 0.01);
	}

}
