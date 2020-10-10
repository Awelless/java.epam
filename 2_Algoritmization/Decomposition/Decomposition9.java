package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static double thirdSide(double x, double y) {
        return sqrt(pow(x, 2) + pow(y, 2));
    }

    private static double triangleSquare(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return sqrt(p * (p - x) * (p - y) * (p - z));
    }

    public static void main(String[] args) {

        System.out.print("Введите размеры сторон прямоугольника: ");

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double t = in.nextDouble();

        double d = thirdSide(x, y);

        double s = triangleSquare(x, y, d) + triangleSquare(z, t, d);
        System.out.printf("Площадь четырехугольника: %f", s);
    }
}
