package com.awelless;

import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер матрицы: ");
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] a = new int[n][m];

        for(int j = 0; j < m; ++j) {

            int counter = 0;

            for(int i = 0; i < n; ++i) {

                if(counter == j + 1) {
                    a[i][j] = 0;
                    continue;
                }

                if(j + 1 - counter >= n - i) {
                    a[i][j] = 1;
                    ++counter;
                }
                else {
                    a[i][j] = random.nextInt(2);
                    if(a[i][j] == 1) ++counter;
                }
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
