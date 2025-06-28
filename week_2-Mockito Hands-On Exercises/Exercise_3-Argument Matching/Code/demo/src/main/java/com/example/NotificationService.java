package com.example;

public class NotificationService {

    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser() {
        notifier.send("Welcome!");
    }
}
