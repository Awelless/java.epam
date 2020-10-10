package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите числа a, b, c, d: ");

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();

        double minAB = a < b ? a : b;
        double minCD = c < d ? c : d;

        double ans = minAB > minCD ? minAB : minCD;
        System.out.printf("max{min(a, b), min(c, d)} = %f", ans);
    }
}
