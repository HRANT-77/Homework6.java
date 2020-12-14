package com.company.ex4;

public class Point {
    private double coordinateX;
    private double coordinateY;


    public Point() {
    }

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }


    public double distance() {
        return Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY,2));
    }

        public double distance(Point point1){
            return Math.sqrt(Math.pow(coordinateX- point1.coordinateX, 2) + Math.pow(coordinateY- point1.coordinateY,2));
        }
    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCordinateY() {
        return coordinateY;
    }

    public void setCordinateY(double cordinateY) {
        this.coordinateY = cordinateY;
    }
}
