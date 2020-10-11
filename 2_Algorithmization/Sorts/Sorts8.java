package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static void swap(int[] a, int i, int j) {

        a[i] += a[j];
        a[j] = a[i] - a[j];
        a[i] -= a[j];

    }

    private static void sort(int[] a) {

        int n = a.length;

        for(int i = 0; i < n; ++i) {
            for(int j = i + 1; j < n; ++j) {
                if(a[i] > a[j]) swap(a, i, j);
            }
        }

    }

    private static int gcd(int a, int b) {

        while(a > 0 && b > 0) {
            if(a > b) a %= b;
            else      b %= a;
        }

        return a + b;
    }

    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество дробей: ");
        int n = in.nextInt();

        System.out.println("Введите значения (числитель знаменатель): ");
        int num[] = new int[n];
        int den[] = new int[n];

        for(int i = 0; i < n; ++i) {
            num[i] = in.nextInt();
            den[i] = in.nextInt();
        }

        int commonDen = 1;
        for(int x : den) {
            commonDen = lcm(commonDen, x);
        }
        for(int i = 0; i < n; ++i) {
            num[i] *= commonDen / den[i];
        }

        sort(num);

        System.out.println("Отсортированные дроби");
        for(int i = 0; i < n; ++i) {
            System.out.printf("%d/%d\n", num[i], commonDen);
        }
    }
}
