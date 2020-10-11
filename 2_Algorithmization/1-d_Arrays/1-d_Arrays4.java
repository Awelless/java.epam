package com.awelless;

import java.util.Scanner;

public class Main {

    private static void swap(double[] a, int pos1, int pos2) {

        double temp = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = temp;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        System.out.print("Введите массив: ");
        double a[] = new double[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextDouble();
        }

        int maxPos = 0;
        double max = a[0];
        int minPos = 0;
        double min = a[0];

        for(int i = 0; i < n; ++i) {

            if(a[i] > max) {
                maxPos = i;
                max = a[i];
            }

            if(a[i] < min) {
                minPos = i;
                min = a[i];
            }
        }

        swap(a, maxPos, minPos);

        System.out.print("Новый массив: ");
        for(double x : a) {
            System.out.print(x + " ");
        }
    }
}
