package org.example;

    public class PayPal extends PaymentMethod {
        @Override
        public void process() {
            System.out.println("Processing PayPal Payment");
        }
    }


