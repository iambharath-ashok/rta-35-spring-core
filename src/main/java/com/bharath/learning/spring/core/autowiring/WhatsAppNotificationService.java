package com.bharath.learning.spring.core.autowiring;

import org.springframework.stereotype.Service;

@Service("whatsAppNotificationService")
public class WhatsAppNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending WhatsApp Notification to " + recipient + " with message: " + message);
    }
}
