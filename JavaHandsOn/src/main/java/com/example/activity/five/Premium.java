/*2. Create an interface called Premium with:
	- A String property title set to the title of the user
	
	- An int method called discountPrice which takes in an int*/
package com.example.activity.five; 

public interface Premium {
	public static final String title = "VIP";
	
	abstract float discountPrice(int discount);
}
