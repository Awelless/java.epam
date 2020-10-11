package com.awelless;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер квадратной матрицы: ");
        int n = in.nextInt();

        System.out.println("Введите матрицу:");
        int a[][] = new int[n][n];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                a[i][j] = in.nextInt();
            }
        }

        System.out.print("Положительные элементы главной диагонали: ");

        for(int i = 0; i < n; ++i) {
            if(a[i][i] > 0) {
                System.out.print(a[i][i] + " ");
            }
        }
    }
}
