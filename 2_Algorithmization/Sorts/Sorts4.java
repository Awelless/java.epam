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

        int swapCounter = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n - 1; ++j) {
                if(a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    ++swapCounter;
                }
            }
        }

        System.out.print("Полученная последовательность: ");
        for(int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.printf("Количество перестановок: %d", swapCounter);
    }
}
