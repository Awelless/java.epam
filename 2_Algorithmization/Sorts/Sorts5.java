package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static int getPos(int[] a, int l, int r, int val) {

        l--;

        while(r - l > 1) {

            int mid = (l + r) / 2;

            if(a[mid] <= val) l = mid;
            else              r = mid;
        }

        return r;
    }

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

        for(int i = 1; i < n; ++i) {

            int cur = a[i];
            int pos = getPos(a, 0, i, cur);

            for(int j = i; j > pos; --j) {
                a[j] = a[j - 1];
            }

            a[pos] = cur;
        }

        System.out.print("Полученная последовательность: ");
        for(int x : a) {
            System.out.print(x + " ");
        }
    }
}
