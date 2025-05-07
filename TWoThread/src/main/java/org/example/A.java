package org.example;

public class A implements Runnable{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);


            try {
                Thread.sleep(2000); // Simulate time delay
            } catch (InterruptedException e) {
                System.out.println(" count meets the limit");
            }
        }

    }
}
