package com.company.ex4;

public class Main4 {
    public static void main(String[] args) {
        Point point1=new Point(5,7);
        System.out.println("Distance between point1 and (0,0) is "+point1.distance());
        Point point2=new Point(2,3);
        System.out.println("Distance between point1 and point2 is "+point1.distance(point2));

    }
}
