package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Using EmailNotification
        NotificationService emailService = new EmailNotification();
        Notifier emailNotifier = new Notifier(emailService);
        emailNotifier.send("Welcome to Dependency Injection");

        // Using SmsNotification
        NotificationService smsService = new SmsNotification();
        Notifier smsNotifier = new Notifier(smsService);
        smsNotifier.send("Welcome to Dependency Injection");
    }
}
