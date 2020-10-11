package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер квадратной матрицы: ");
        int n = in.nextInt();

        System.out.println("Введите матрицу: ");
        int a[][] = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("\nЭлементы стоящие на глваной диагонали:");
        for(int i = 0; i < n; ++i) {
            System.out.print(a[i][i] + " ");
        }

        System.out.println("Элементы стоящие на побочной диагонали:");
        for(int i = 0; i < n; ++i) {
            System.out.print(a[i][n - i - 1] + " ");
        }

    }
}
