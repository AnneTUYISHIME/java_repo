package org.example;



    public class Notifier {
        private NotificationService notificationService;

        // Constructor Injection
        public Notifier(NotificationService notificationService) {
            this.notificationService = notificationService;
        }

        public void send(String message) {
            notificationService.send(message);
        }
    }


