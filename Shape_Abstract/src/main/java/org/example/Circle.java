package org.example;

public class Circle extends Shape {

    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void CalculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle = " + area  + " cm²");
    }

}
