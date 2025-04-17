package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Bird instance
        Bird bird = new Bird();
        bird.makeSound();
        bird.fly();

        // Polymorphism examples
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal animalBird = new Bird();

        dog.makeSound();
        cat.makeSound();
        animalBird.makeSound();
    }
}


