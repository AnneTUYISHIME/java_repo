package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // creation of circle object
    Circle circle = new Circle();
    // calling of methods with circle object
        circle.color = "red";
        circle.radius = 10;
    circle.Draw();
    circle.getArea();


    // creation of rectangele object
        Rectangle rectangle = new Rectangle();
        rectangle.color = "blue";
        rectangle.length= 5;
        rectangle.width= 2;
        rectangle.Draw();
        rectangle.getArea();


    }
}