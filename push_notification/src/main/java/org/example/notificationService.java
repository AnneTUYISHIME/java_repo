package org.example;

//public class notificationService {
     interface NotificationService {
        void sendNotification(String message);

        // Bonus method (optional)
        default void setDefaultPriority(String priority) {
            // Default implementation (does nothing by default)
        }
    }

//}
