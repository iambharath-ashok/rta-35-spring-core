package com.bharath.learning.spring.core.injectionstypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NotificationServiceApp {

    public static void main(String[] args) {


        ApplicationContext context =
                new AnnotationConfigApplicationContext(NotificationServiceConfig.class);

        EmailNotificationService emailService = context.getBean(EmailNotificationService.class);
        emailService.sendEmail("Hello to spring", "Bharath@exmpls.com");

        SmsNotificationService smsService = context.getBean(SmsNotificationService.class);
        smsService.sendSms("Hello to spring", "1234567890");

        PushNotificationService pushService = context.getBean(PushNotificationService.class);
        pushService.sendPushNotification("Hello via push notification", "bharath");
    }
}
