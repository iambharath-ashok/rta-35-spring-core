package com.bharath.learning.spring.core.injectionstypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class NotificationSender {

    public void sent(String message, String to) {
        System.out.println("Notification sent to " + to + " with message: " + message);
    }
}


@Service
class EmailNotificationService {

    private final NotificationSender notificationSender;

    //Constructor Injection
    @Autowired
    public EmailNotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendEmail(String message, String to) {
        notificationSender.sent(message, to);
    }
}


@Service
class SmsNotificationService {

    // Field Injection
    @Autowired
    private NotificationSender notificationSender;


    public void sendSms(String message, String to) {
        notificationSender.sent(message, to);
    }
}


@Service
class PushNotificationService {

    // Setter Injection
    private NotificationSender notificationSender;

    // Setter Injection
    @Autowired
    public void setNotificationSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendPushNotification(String message, String to) {
        notificationSender.sent(message, to);
    }
}