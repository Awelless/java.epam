package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер матрицы: ");
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println("Введите матрицу: ");
        int[][] a = new int[n][m];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                a[i][j] = in.nextInt();
            }
        }

        int maxValue = a[0][0];
        for(int[] x : a) {
            for(int y : x) {
                maxValue = max(maxValue, y);
            }
        }

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                if((i + j) % 2 == 1) a[i][j] = maxValue;
            }
        }

        System.out.println("Полученная матрица: ");
        for(int[] x : a) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
