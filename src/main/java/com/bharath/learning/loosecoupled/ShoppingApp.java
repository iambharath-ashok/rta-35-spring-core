package com.bharath.learning.loosecoupled;

public class ShoppingApp {

    public static void main(String[] args) {

        PaymentService paymentService = new CreditCard();

        //First transaction with CreditCard
        ShoppingCart cart = new ShoppingCart(paymentService);
        cart.checkout(100.0);

        //Second transaction with PayPal
        paymentService = new PayPal();
        cart = new ShoppingCart(paymentService);
        cart.checkout(200.0);

        //Third transaction with BankTransfer
        paymentService = new BankTransfer();
        cart = new ShoppingCart(paymentService);
        cart.checkout(300.0);

        //Fourth transaction with DebitCard
        paymentService = new DebitCard();
        cart = new ShoppingCart(paymentService);
        cart.checkout(400.0);



    }
}
