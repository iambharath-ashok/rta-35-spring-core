package com.bharath.learning.spring.core.beans.loosecouple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShoppingApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShoppingAppConfig.class);
        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        //shoppingCart.checkout(100);

        PayPal payPal = context.getBean(PayPal.class);
        DebitCard debitCard = context.getBean(DebitCard.class);
        CreditCard creditCard = context.getBean(CreditCard.class);
        BankTransfer bankTransfer = context.getBean(BankTransfer.class);

        shoppingCart.setPaymentService(debitCard);
        shoppingCart.checkout(200);

        shoppingCart.setPaymentService(creditCard);
        shoppingCart.checkout(300);

        shoppingCart.setPaymentService(payPal);
        shoppingCart.checkout(400);

        shoppingCart.setPaymentService(bankTransfer);
        shoppingCart.checkout(500);
    }
}
