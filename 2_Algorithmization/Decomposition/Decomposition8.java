package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static int sum(int[] a, int l, int r) {
        return a[l] + a[l + 1] + a[r];
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        System.out.print("Введите массив: ");
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        System.out.print("Полученные суммы: ");
        for(int i = 0; i < n - 2; ++i) {
            System.out.print(sum(a, i, i + 2) + " ");
        }
    }
}
