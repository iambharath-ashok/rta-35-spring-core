package com.bharath.learning.tightcoupled;

public class ShoppingCart {

    private CreditCard paymentService = new CreditCard();

    public void checkout(double amount) {
        paymentService.pay(amount);
    }

}


class CreditCard {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }

}