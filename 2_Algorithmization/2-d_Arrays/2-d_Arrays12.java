package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static void swap(int[] a, int i, int j) {

        a[i] += a[j];
        a[j] = a[i] - a[j];
        a[i] -= a[j];

    }

    private static void sort(int[] a, boolean reverse) {

        int n = a.length;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (a[i] > a[j] ^ reverse) swap(a, i, j);
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

        for(int i = 0; i < n; ++i) {
            sort(a[i], false);
        }

        System.out.println("Матрица, в котором строки отсортированный по возрастанию");
        for(int[] x : a) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; ++i) {
            sort(a[i], true);
        }

        System.out.println("Матрица, в котором строки отсортированный по убыванию");
        for(int[] x : a) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
