package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.print("Введите массив: ");
        int a[] = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        int max = a[0];
        int secondMax = (int)-2e9;

        for(int x : a) {

            if(x > max) {
                secondMax = max;
                max = x;
            }
            else if (x > secondMax && x != max) {
                secondMax = x;
            }
        }

        if(secondMax == (int)-2e9) {
            System.out.println("Массив состоит из одинаковых элементов");
        }
        else {
            System.out.printf("Второе по велечине число: %d", secondMax);
        }

    }
}
