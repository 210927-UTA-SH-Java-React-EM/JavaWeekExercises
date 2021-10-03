package com.example.activity.five;

public class CustomerDriver {

	public static void main(String[] args) {

		PremiumCustomer pc1 = new PremiumCustomer();
		pc1.name = "Omobee";
		pc1.setVipCard(9002);
		pc1.setYears(11);
		
		pc1.buy("Milk", 10);
		pc1.buy("Egg", 5);
		pc1.buy("Sugar", 2);
		
		double total = 0;
		for (String i : pc1.cartMap.keySet()) {
			System.out.println(i + " ==> " + pc1.cartMap.get(i));
			total += pc1.cartMap.get(i);
		}
		System.out.print("Cart total ----> " + total);

	}

}
