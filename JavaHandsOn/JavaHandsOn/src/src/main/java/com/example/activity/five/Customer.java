package src.main.java.com.example.activity.five;

public abstract class Customer {
	protected String name;
	protected int balance;
	protected String cart;
	protected int cartCost;
	
	
	public Customer(String name, int balance, String cart, int cartCost) 
	{
		this.name = name;
		this.balance = balance;
		this.cart = cart;
		this.cartCost = cartCost;
	}
	
	public String addToCart(String item, int cost)
	{
		this.cart = item;
		this.cartCost = cost;
		return this.cart;
	}
	
	public abstract void buy();
	
}
