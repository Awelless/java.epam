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

        System.out.print("Числа, для которых выполняется условие a[i] > i: ");
        for(int i = 0; i < n; ++i) {

            if(a[i] > i + 1) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
