package com.example.activity.one;

public class Foo{
	
	public String bar;
	
	
	public Foo() {
		this.bar = "bar";
	}
	
	public Foo(String str) {
		this.bar = str;
	}
	
	public void printBar() {
		System.out.println("The variable is: " + this.bar);
	}
	
	
	
}

/*
1. In this file create a public class called Foo
2. Foo should have a public String variable called bar
3. Foo should have a public no-args constructor that sets the default value of bar to "bar"
4. Foo should have a public one-arg constructor that sets the value of bar to what ever value is input into the constructor
5. Foo should have a method called printBar which simply prints the value of your variable bar
*/
