package com.example.activity.one;

/*
1. In this file create a public class called Foo
2. Foo should have a public String variable called bar
3. Foo should have a public no-args constructor that sets the default value of bar to "bar"
4. Foo should have a public one-arg constructor that sets the value of bar to what ever value is input into the constructor
5. Foo should have a method called printBar which simply prints the value of your variable bar
*/
public class Foo{
	public String bar;
	public Foo() {
		
		this.bar="";
				
	}
	public Foo(String s) {
		
		this.bar=s;
	}
	public void printBar(String s) {
		
		System.out.println("The value of bar is "+ s);
	}
}
