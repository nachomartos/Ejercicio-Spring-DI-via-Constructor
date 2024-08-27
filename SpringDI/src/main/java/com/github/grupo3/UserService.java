package com.github.grupo3;

public class UserService {
    private NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String userName) {
        notificationService.sendNotification(userName);
    }
}
