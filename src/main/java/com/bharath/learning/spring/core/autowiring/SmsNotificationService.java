package com.bharath.learning.spring.core.autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("smsNotificationService")
@Primary
public class SmsNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS Notification to " + recipient + " with message: " + message);
    }
}
