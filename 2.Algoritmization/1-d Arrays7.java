package com.awelless;

import java.util.Scanner;

public class Main {

    private static boolean prime(int a) {

        if(a == 1) return false;

        for(int i = 2; i <= a / 2; ++i) {
            if(a % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину последовательности: ");
        int n = in.nextInt();

        System.out.print("Введите последоваетльность: ");
        double a[] = new double[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextDouble();
        }

        double ans = a[0] + a[n - 1];
        for(int i = 1; i < n; ++i) {

            int j = n - i - 1;

            if(i > j) break;

            if(a[i] + a[j] > ans) {
                ans = a[i] + a[j];
            }
        }

        System.out.printf("Ответ равен %f", ans);
    }
}
