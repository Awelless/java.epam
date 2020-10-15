package com.awelless;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Point {

    private double x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(double _x, double _y) {
        x = _x;
        y = _y;
    }

    Point getMidPoint(Point other) {
        return new Point((x + other.x) / 2, (y + other.y) / 2);
    }

    Point getMidPoint(Point other, int part1, int part2) {
        int div = part1 + part2;
        double xDifference = (other.x - x) / div;
        double yDifference = (other.y - y) / div;
        return new Point(x + xDifference * part1, y + yDifference * part1);
    }

    static Point getMidPoint(Point a, Point b) {
        return new Point((a.x + b.x) / 2, (a.y + b.y) / 2);
    }

    static Point getMidPoint(Point a, Point b, int part1, int part2) {
        int div = part1 + part2;
        double xDifference = (b.x - a.x) / div;
        double yDifference = (b.y - a.y) / div;
        return new Point(a.x + xDifference * part1, a.y + yDifference * part1);
    }

    double distance(Point other) {
        return sqrt(pow(x - other.x, 2) + pow(y - other.y, 2));
    }

    static double distance(Point a, Point b) {
        return a.distance(b);
    }

    @Override
    public String toString() {
        return new String(Double.toString(x) + " " + Double.toString(y));
    }
}

public class Triangle {

    private Point p1, p2, p3;

    Triangle() {
    }

    Triangle(Point _p1, Point _p2, Point _p3) {
        p1 = _p1;
        p2 = _p2;
        p3 = _p3;
    }

    Triangle(double _x1, double _y1, double _x2, double _y2, double _x3, double _y3) {
        p1 = new Point(_x1, _y1);
        p2 = new Point(_x2, _y2);
        p3 = new Point(_x3, _y3);
    }

    public double getPerimeter() {
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }

    public double getSquare() {

        double p = getPerimeter() / 2;
        double a = p1.distance(p1);
        double b = p1.distance(p3);
        double c = p2.distance(p3);

        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public Point getMedianCrossingPoint() {

        Point center23 = Point.getMidPoint(p2, p3);
        System.out.println(p1);
        System.out.println(center23);
        return p1.getMidPoint(center23, 2, 1);
    }

}
