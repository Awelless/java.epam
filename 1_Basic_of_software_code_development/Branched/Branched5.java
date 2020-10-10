package com.awelless;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите x: ");

        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();

        double ans = 0;

        if(x <= 3) {
            ans = pow(x, 2) + 3 * x + 9;
        }
        else {
            ans = 1 / (pow(x, 3) + 6);
        }

        System.out.printf("F(x) = %f", ans);
    }
}
