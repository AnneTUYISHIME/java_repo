package org.example;

 public  class Circle implements Shape {
     double radius;
     public Circle(double radius) {
         this.radius = radius;
     }
         @Override
      public  void getArea(){
             System.out.println("Inside Circle = " + radius*radius*Math.PI);
         }

         @Override
             public  void Draw(){
             System.out.println("drawing of  Circle ");
         }



 }
