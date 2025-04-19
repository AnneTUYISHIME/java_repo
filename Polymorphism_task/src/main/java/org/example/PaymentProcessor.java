package org.example;

public class PaymentProcessor {

        // Method Overloading: multiple versions of processPayment
        public void processPayment(CreditCard creditCard) {
            creditCard.process();
        }

        public void processPayment(PayPal payPal) {
            payPal.process();
        }

        public void processPayment(Bitcoin bitcoin) {
            bitcoin.process();
        }

        public void processPayment(ApplePay applePay) {
            applePay.process();
        }
    }


