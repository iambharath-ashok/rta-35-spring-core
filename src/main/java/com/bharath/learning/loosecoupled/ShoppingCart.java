package com.bharath.learning.loosecoupled;

public class ShoppingCart {

    private PaymentService paymentService;

    public ShoppingCart(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void checkout(double amount) {
        paymentService.pay(amount);
    }


}

interface PaymentService {
    void pay(double amount);
}

class CreditCard implements PaymentService {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }

}

class PayPal implements PaymentService {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }

}

class BankTransfer implements PaymentService {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bank Transfer.");
    }

}

class DebitCard implements PaymentService {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Debit Card.");
    }

}
