package com.awelless;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(-4, -1);
        Point p2 = new Point(0, -3);
        Point p3 = new Point(2, 1);

        Triangle triangle = new Triangle(p1, p2, p3);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getSquare());
        System.out.println(triangle.getMedianCrossingPoint());
    }
}
