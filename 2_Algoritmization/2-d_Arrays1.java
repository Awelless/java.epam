package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер матрицы: ");
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println("Введите матрицу: ");
        double a[][] = new double[n][m];
        for (int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                a[i][j] = in.nextDouble();
            }
        }

        System.out.println("Нечетные столбцы, первый элемент которых больше последнего:");
        for(int j = 0; j < m; j += 2) {

            if(a[0][j] > a[n - 1][j]) {
                for(int i = 0; i < n; ++i) {
                    System.out.println(a[i][j]);
                }
                System.out.println("---------");
            }
        }

    }
}
