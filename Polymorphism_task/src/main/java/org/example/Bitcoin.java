package org.example;


    public class Bitcoin extends PaymentMethod {
        private String transactionId;

        public Bitcoin(String transactionId) {
            this.transactionId = transactionId;
        }

        public String getTransactionId() {
            return transactionId;
        }

        @Override
        public void process() {
            System.out.println("Processing Bitcoin Payment with Transaction ID: " + transactionId);
        }
    }


