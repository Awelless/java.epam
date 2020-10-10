package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину последовательности: ");
        int n = in.nextInt();

        System.out.print("Введите последовательность: ");
        int a[] = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        int min = a[0];
        for(int x : a) {
            if(x < min) {
                min = x;
            }
        }

        System.out.print("Полученная последовательность: ");
        for(int x : a) {
            if(x != min) {
                System.out.print(x + " ");
            }
        }
    }
}
