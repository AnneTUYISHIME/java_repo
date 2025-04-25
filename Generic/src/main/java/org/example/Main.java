package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box();

        stringBox.set("TUYISHIME Anne");

        Box<String> stringBox2 = new Box();


        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(1);
        Box<Integer> integerBox1 = new Box<Integer>();


       // stringBox.isPresent(Anne);
        stringBox.isPresent();



        System.out.println("stringBox1 has content? " + stringBox.isPresent());
        System.out.println("stringBox2 has content? " + stringBox2.isPresent());
        System.out.println("intBox1 has content? " + integerBox.isPresent());
        System.out.println("intBox2 has content? " + integerBox1.isPresent());
    }
}