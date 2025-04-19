package org.example;


    public class ApplePay extends PaymentMethod {
        @Override
        public void process() {
            System.out.println("Processing Apple Pay Payment");
        }
    }


