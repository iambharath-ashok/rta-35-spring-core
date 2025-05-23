package com.bharath.learning.spring.core.beans.loosecouple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    // Field Injection
    @Autowired
    private PaymentService paymentService;


    // Constructor Injection
    public ShoppingCart(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void checkout(double amount) {
        paymentService.pay(amount);
    }

    // Setter Injection
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}


interface PaymentService {
    void pay(double amount);
}

@Primary
@Component
class CreditCard implements PaymentService {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }

}

@Component
class PayPal implements PaymentService {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }

}

@Component
class BankTransfer implements PaymentService {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bank Transfer.");
    }

}

@Component
class DebitCard implements PaymentService {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Debit Card.");
    }

}
