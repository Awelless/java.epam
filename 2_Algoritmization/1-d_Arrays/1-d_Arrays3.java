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

        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        for(double x : a) {

            if(x > 0) {
                ++positiveCounter;
            }
            else if(x < 0) {
                ++negativeCounter;
            }
            else {
                ++zeroCounter;
            }
        }

        System.out.printf("Количество положительных элементов: %d\n", positiveCounter);
        System.out.printf("Количество отрицательных элементов: %d\n", negativeCounter);
        System.out.printf("Количество нулевых элементов: %d\n", zeroCounter);
    }
}
