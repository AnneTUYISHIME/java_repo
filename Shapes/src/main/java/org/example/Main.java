package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle c1= new Circle(5);
        c1.getArea();
        c1.Draw();
        Triangle t1= new Triangle(5,5);
        t1.getArea();
        t1.Draw();
        Rectangle r1= new Rectangle(5,5);
        r1.getArea();
        r1.Draw();
    }
}