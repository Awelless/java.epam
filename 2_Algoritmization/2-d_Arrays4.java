package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер квадратной матрицы: ");
        int n = in.nextInt();

        int a[][] = new int[n][n];
        for (int i = 0; i < n; i += 2) {
            for(int j = 0; j < n; ++j) {
                a[i][j] = j + 1;
            }
        }
        for (int i = 1; i < n; i += 2) {
            for(int j = 0; j < n; ++j) {
                a[i][n - j - 1] = j + 1;
            }
        }

        System.out.println("Полученная матрица: ");
        for(int x[] : a) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
