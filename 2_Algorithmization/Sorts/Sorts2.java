package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер первой последовательности: ");
        int n = in.nextInt();

        System.out.print("Введите первую последовательность: ");
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        System.out.print("Введите размер второй последовательности: ");
        int m = in.nextInt();

        System.out.print("Введите вторую последовательность: ");
        int[] b = new int[m];
        for(int i = 0; i < m; ++i) {
            b[i] = in.nextInt();
        }

        int[] ans = new int[n + m];
        int ptrA = 0;
        int ptrB = 0;
        for(int i = 0; i < n + m; ++i) {

            if(ptrA == n) {
                ans[i] = b[ptrB++];
                continue;
            }
            if(ptrB == m) {
                ans[i] = a[ptrA++];
                continue;
            }

            if(a[ptrA] > b[ptrB]) {
                ans[i] = b[ptrB++];
            }
            else {
                ans[i] = a[ptrA++];
            }
        }

        System.out.print("Полученная последовательность: ");
        for(int x : ans) {
            System.out.print(x + " ");
        }
    }
}
