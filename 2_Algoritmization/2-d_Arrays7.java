package com.awelless;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер квадратной матрицы: ");
        int n = in.nextInt();

        double a[][] = new double[n][n];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                a[i][j] = sin(((pow(i + 1, 2) - pow(j + 1, 2))) / n);
            }
        }

        System.out.println("Полученная матрица: ");
        for(double x[] : a) {
            for(double y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        int positiveCounter = 0;
        for(double x[] : a) {
            for(double y : x) {
                if(y > 0) ++positiveCounter;
            }
        }
        System.out.printf("Положительных элементов: %d", positiveCounter);
    }
}
