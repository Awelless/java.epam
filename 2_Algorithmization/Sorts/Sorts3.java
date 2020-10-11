package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static void swap(int[] a, int i, int j) {

        a[i] += a[j];
        a[j] = a[i] - a[j];
        a[i] -= a[j];

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер последовательности: ");
        int n = in.nextInt();

        System.out.print("Введите последовательность: ");
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        for(int i = 0; i < n; ++i) {
            for(int j = i + 1; j < n; ++j) {
                if(a[j] > a[i]) swap(a, i, j);
            }
        }

        System.out.print("Полученная последовательность: ");
        for(int x : a) {
            System.out.print(x + " ");
        }
    }
}
