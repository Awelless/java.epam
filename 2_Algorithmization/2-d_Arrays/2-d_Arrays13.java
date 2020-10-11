package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static void swap(int[][] a, int column, int i, int j) {

        a[i][column] += a[j][column];
        a[j][column] = a[i][column] - a[j][column];
        a[i][column] -= a[j][column];

    }

    private static void sort(int[][] a, boolean reverse) {

        int m = a[0].length;
        int n = a.length;

        for (int column = 0; column < m; ++column) {
            for(int i = 0; i < n; ++i)
                for (int j = i + 1; j < n; ++j) {
                    if (a[i][column] > a[j][column] ^ reverse) swap(a, column, i, j);
                }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер матрицы: ");
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] a = new int[n][m];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                a[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < m; ++i) {
            sort(a, false);
        }

        System.out.println("Матрица, в котором столбцы отсортированный по возрастанию");
        for(int[] x : a) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < m; ++i) {
            sort(a, true);
        }

        System.out.println("Матрица, в котором столбцы отсортированный по убыванию");
        for(int[] x : a) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
