package org.example;

public class Rectangle extends Shape {
    double x , y;
    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;

    }
    public void CalculateArea(){
        double area = x*y;
        System.out.println("Area = " + area + " cm²");

    }
}
