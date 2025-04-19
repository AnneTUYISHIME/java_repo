package org.example;


    public class CreditCard extends PaymentMethod {
        @Override
        public void process() {
            System.out.println("Processing Credit Card Payment");
        }
    }


