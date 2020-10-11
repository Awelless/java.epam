package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        System.out.print("Введите массив: ");
        double a[] = new double[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextDouble();
        }

        System.out.print("Введите число z: ");
        double z = in.nextDouble();

        int changeCounter = 0;

        for(int i = 0; i < n; ++i) {

            if(a[i] > z) {
                ++changeCounter;
                a[i] = z;
            }
        }

        System.out.print("Новый массив: ");
        for(double x : a) {
            System.out.print(x + " ");
        }
        System.out.printf("\nКоличество замен: %d", changeCounter);
    }
}
