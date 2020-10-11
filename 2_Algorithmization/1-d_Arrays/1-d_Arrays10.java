package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = in.nextInt();

        System.out.print("Введите массив: ");
        int a[] = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        for (int i = 0; 2 * i < n; ++i) {
            a[i] = a[i * 2];
        }
        for (int i = (n + 1) / 2; i < n; ++i) {
            a[i] = 0;
        }

        System.out.print("Новый массив: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
