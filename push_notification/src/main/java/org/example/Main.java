package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



            public static void main(String[] args) {
                // Create and test PushNotification
                NotificationService push = new PushNotification("device123");
                push.sendNotification("You have a new push alert!");
                push.setDefaultPriority("HIGH");

                // Optional: Confirm Email & SMS if needed (assumed already tested in class)
                // Not needed for submission per instructions
            }
        }


