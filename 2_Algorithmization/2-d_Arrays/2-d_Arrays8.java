package com.awelless;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер матрицы: ");
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println("Введите матрицу:");
        double a[][] = new double[n][m];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                a[i][j] = in.nextDouble();
            }
        }

        System.out.print("Введите номера столбцов, которые нужно поменять: ");
        int pos1 = in.nextInt() - 1;
        int pos2 = in.nextInt() - 1;

        for(int i = 0; i < n; ++i) {
            //swap
            a[i][pos1] += a[i][pos2];
            a[i][pos2] = a[i][pos1] - a[i][pos2];
            a[i][pos1] -= a[i][pos2];
        }

        System.out.println("Новая матрица: ");
        for(double x[] : a) {
            for(double y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
