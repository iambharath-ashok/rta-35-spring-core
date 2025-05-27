package com.bharath.learning.spring.core.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BankConfiguration.class);

        AccountAlertManager accountAlertManager =
                context.getBean(AccountAlertManager.class);
        accountAlertManager.alertUser("Bharath",
                "Your account has been credited with $1000");

    }
}
