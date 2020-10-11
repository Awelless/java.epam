package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер первого массива: ");
        int n = in.nextInt();

        System.out.print("Введите первый массив: ");
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        System.out.print("Введите размер второго массива: ");
        int m = in.nextInt();

        System.out.print("Введите второй массив: ");
        int[] b = new int[n + m];
        for(int i = 0; i < m; ++i) {
            b[i] = in.nextInt();
        }

        System.out.print("Введите число k: ");
        int k = in.nextInt();

        for(int i = m - 1; i >= 0; --i) {
            b[i + k] = b[i];
        }
        for(int i = 0; i < k; ++i) {
            b[i] = a[i];
        }
        for(int i = k; i < n; ++i) {
            b[i + m] = a[i];
        }

        System.out.print("Полученный массив: ");
        for(int x : b) {
            System.out.print(x + " ");
        }
    }
}
