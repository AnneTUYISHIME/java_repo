package org.example;

public class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        System.out.println("Area of Shape ");
   return 0.0;
    }

    public void Draw() {
        System.out.println("this is a Shape");
    }
}


     class Circle extends Shape {
         double PI = 3.14159;
         double radius;

         public Circle() {
             super("color");
             this.radius = radius;
             this.PI = PI;
         }

         @Override
         public double getArea() {
             double area = radius * radius * PI;
             System.out.println("this is area of  Circle :" + area );

              return area;
         }
         @Override
         public void Draw() {
             System.out.println("Drawing od Circle " + color);
         }

     }
     class Rectangle extends Shape {
         double length;
         double width;

         public Rectangle() {
             super("color");
             this.length = length;
             this.width = width;

         }

         @Override
         public double getArea() {
             double area = length * width;
             System.out.println("this is area of  Rectangle :" + area );

                return area;
         }

         @Override
         public void Draw() {
             System.out.println("Drawing of rectangle  :" + color);
         }
     }



