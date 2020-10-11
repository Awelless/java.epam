package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static void swap(double[] a, int i, int j) {

        a[i] += a[j];
        a[j] = a[i] - a[j];
        a[i] -= a[j];

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        System.out.print("Введите массив: ");
        double[] a = new double[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextDouble();
        }

        int ptr = 0;
        while(ptr < n - 1) {

            if(a[ptr] <= a[ptr + 1]) {
                ++ptr;
            }
            else {
                swap(a, ptr, ptr + 1);
                ptr = max(0, ptr - 1);
            }
        }

        System.out.print("Полученный массив: ");
        for(double x : a) {
            System.out.print(x + " ");
        }
    }
}
