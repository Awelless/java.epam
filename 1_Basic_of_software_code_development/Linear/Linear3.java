package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите числа x, y:  ");

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        double num = Math.sin(x) + Math.cos(y);
        double den = Math.cos(x) - Math.sin(y);

        if(den == 0) {
            System.out.print("Знаменатель равен нулю. Выражение не имеет смысла");
            return;
        }

        double ans = num * Math.tan(x * y) / den;

        System.out.printf("Выражение равно %f", ans);
    }
}
