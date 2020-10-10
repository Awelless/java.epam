package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите числа a, b, h: ");

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double h = in.nextDouble();

        System.out.print("Значения функции y на отрезке [a, b] с шагом h равны:");

        for (double x = a; x <= b; x += h) {

            double ans = x > 2 ? x : -x;
            System.out.print(" " + ans);
        }
    }
}
