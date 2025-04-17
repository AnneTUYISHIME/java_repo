package org.example;

public class Bird extends Animal {
    public void fly() {
        System.out.println("Bird does: Flying!");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp!");
    }
}




