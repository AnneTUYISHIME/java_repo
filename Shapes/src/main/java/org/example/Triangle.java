package org.example;

public class Triangle implements Shape{
    double h,b;
    public Triangle(double h,double b){
        this.h=h;
        this.b=b;


    }
    public void getArea(){
        System.out.println("Area of Triangle is "+ (h*b)/2);
    }
    public void Draw(){
        System.out.println("drawing of  Triangle ");
    }
}
