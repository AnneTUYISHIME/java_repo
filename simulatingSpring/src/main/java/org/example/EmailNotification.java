package org.example;


    public class EmailNotification implements NotificationService {
        @Override
        public void send(String message) {
            System.out.println("Sending email: " + message);
        }
    }


