package com.example.activity.five;

import java.util.ArrayList;

public class PremiumCustomer extends Customer implements Premium {
    private int vipCard;
    private int years;

    public PremiumCustomer() {
    }

    public PremiumCustomer(String name, int balance, ArrayList<String> cart, int cartCost, int vipCard, int years) {
        super(name, balance, cartCost);
        this.vipCard = vipCard;
        this.years = years;
    }

    public PremiumCustomer(String name, int balance, ArrayList<String> cart, int cartCost) {
        super(name, balance, cartCost);
    }

    @Override
    public void buy() {

    }

    @Override
    public int discountPrice(int num) {
        double discount = (double) num / 100;
        return (int) (this.getCartCost() - (this.getCartCost() * discount));
    }


    public int getVipCard() {
        return vipCard;
    }

    public void setVipCard(int vipCard) {
        this.vipCard = vipCard;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
