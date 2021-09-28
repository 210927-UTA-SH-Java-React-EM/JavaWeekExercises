package com.example.controlflow;

public class ControlFlow {
	
	public static void main(String args[]) {
		ControlFlow cf = new ControlFlow();
		cf.ifElseIfExample(-1);
		
	}
	
	public void ifElseIfExample(int a) {
		if(a < 0) {
			System.out.println("The number is negative");
		} else if (a > 0) {
			System.out.println("The number is positive");
		} else {
			System.out.println("The number is zero");
		}
		
	}
}
