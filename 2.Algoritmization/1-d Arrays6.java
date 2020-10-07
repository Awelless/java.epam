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

        double ans = 0;
        for(int i = 0; i < n; ++i) {
            if(prime(i + 1)) {
                ans += a[i];
            }
        }

        System.out.printf("Сумма чисел, порядковые номера которых являются простыми числами: %f", ans);
    }
}
