package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        shape.getArea();
        shape.Draw();

        Shape shape2 = new Rectangle(5,5);
        shape2.getArea();
        shape2.Draw();
        Shape shape3 = new Triangle(5,5);
        shape3.getArea();
        shape3.Draw();

        /*Circle c1= new Circle(5);
        c1.getArea();
        c1.Draw();
        Triangle t1= new Triangle(5,5);
        t1.getArea();
        t1.Draw();
        Rectangle r1= new Rectangle(5,5);
        r1.getArea();
        r1.Draw();*/
    }
}