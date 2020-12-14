package com.company.ex2;

public class Main2 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setHeight(5);
        rectangle1.setWidth(6);

        System.out.println("Perimeter is " + rectangle1.calculatePerimeter());
        System.out.println("Area is " + rectangle1.calculateArea());
    }
}
