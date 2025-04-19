package org.example;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();
        Bitcoin bitcoin = new Bitcoin("TXN-789456");
        ApplePay applePay = new ApplePay();

        // Using method overloading + overridden process methods
        processor.processPayment(creditCard);
        processor.processPayment(payPal);
        processor.processPayment(bitcoin);
        processor.processPayment(applePay);
    }
}
