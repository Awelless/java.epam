package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        System.out.print("Введите массив: ");
        int a[] = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        System.out.print("Введите число k: ");
        int k = in.nextInt();

        int ans = 0;
        for(int x : a) {
            if(x % k == 0) {
                ans += x;
            }
        }

        System.out.printf("Сумма элементов, кратных k: %d", ans);
    }
}
