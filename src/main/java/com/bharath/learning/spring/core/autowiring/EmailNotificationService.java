package com.bharath.learning.spring.core.autowiring;

import org.springframework.stereotype.Service;

@Service("emailNotificationService")
public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Email Notification to " + recipient + " with message: " + message);
    }
}
