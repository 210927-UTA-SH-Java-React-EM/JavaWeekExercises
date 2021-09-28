package com.example.activity.five;

import java.util.ArrayList;

public abstract class Customer {
    private String name;
    private int balance;
    private ArrayList<String> cart = new ArrayList<>();
    private int cartCost;

    public Customer() {
    }

    public Customer(String name, int balance, int cartCost) {
        this.name = name;
        this.balance = balance;
        this.cartCost = cartCost;
    }

    public abstract void buy();

    public ArrayList<String> addToCart(String item, int cost) {
        this.cart.add(item);
        this.cartCost = this.getCartCost() + cost;

        return this.cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ArrayList<String> getCart() {
        return cart;
    }

    public void setCart(ArrayList<String> cart) {
        this.cart = cart;
    }

    public int getCartCost() {
        return cartCost;
    }

    public void setCartCost(int cartCost) {
        this.cartCost = cartCost;
    }
}
