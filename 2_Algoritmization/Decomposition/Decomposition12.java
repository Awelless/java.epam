package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static int numberSum(int x) {

        int sum = 0;
        while(x > 0) {
            sum += x % 10;
            x /= 10;
        }

        return sum;
    }

    private static int[] buildArray(int n, int k) {

        int size = 0;
        for(int i = 0; i <= n; ++i) {
            if(numberSum(i) == k) ++size;
        }

        int out[] = new int[size];
        int ptr = 0;
        for(int i = 0; i <= n; ++i) {
            if(numberSum(i) == k) out[ptr++] = i;
        }

        return out;
    }

    public static void main(String[] args) {

        System.out.print("Введите числа n и k: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] a = buildArray(n, k);

        System.out.print("Полученный массив: ");
        for(int x : a) {
            System.out.print(x + " ");
        }
    }
}
