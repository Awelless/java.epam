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
        int a[][] = new int[n][m];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                a[i][j] = in.nextInt();
            }
        }
        
        int sum[] = new int[m];
        int maxSum = 0;
        int posMax = 0;

        for(int j = 0; j < m; ++j) {

            for(int i = 0; i < n; ++i) {
                sum[j] += a[i][j];
            }

            if(sum[j] > maxSum) {
                maxSum = sum[j];
                posMax = j;
            }
        }

        System.out.print("Сумма столбцов матрицы: ");
        for(int j = 0; j < m; ++j) {
            System.out.print(sum[j] + " ");
        }

        System.out.printf("Столбец с наибольшей суммой: %d", posMax + 1);
    }
}
