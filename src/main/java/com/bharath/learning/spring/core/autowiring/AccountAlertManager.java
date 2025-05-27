package com.bharath.learning.spring.core.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AccountAlertManager {


    @Autowired
    @Qualifier("emailNotificationService")
    public NotificationService notificationService;

    public void alertUser(String to , String message) {
        notificationService.sendNotification(message, to);
    }

}
