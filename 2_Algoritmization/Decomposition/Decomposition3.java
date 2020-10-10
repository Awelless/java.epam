package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static double triangleSquare(int a) {

        return 1.0 * a * a * sqrt(3) / 4;
    }

    public static void main(String[] args) {

        System.out.print("Введите размер стороны шестиугольника: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.printf("Площаль равна: %f", 6.0 * triangleSquare(n));
    }
}
