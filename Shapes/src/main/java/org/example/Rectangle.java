package org.example;

public class Rectangle implements Shape{
    double x,y;
    public Rectangle(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void getArea(){
        System.out.println("area of  Rectangle = " + x*y);
    }
    public void Draw(){
        System.out.println("drawing of  Rectangle ");
    }
}
