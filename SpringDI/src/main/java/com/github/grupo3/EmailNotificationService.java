package com.github.grupo3;

public class EmailNotificationService implements NotificationService{

    @Override
    public void sendNotification(String message) {
        System.out.println("Bienvenido " + message);
    }
}
