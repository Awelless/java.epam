package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static int getPos(double[] a, int l, int r, double val) {

        --l;

        while(r - l > 1) {

            int mid = (l + r) / 2;

            if(a[mid] <= val) l = mid;
            else              r = mid;

        }

        return r;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер первой последовательности: ");
        int n = in.nextInt();

        System.out.print("Введите первую последовательность: ");
        double[] a = new double[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextDouble();
        }

        System.out.print("Введите размер второй последовательности: ");
        int m = in.nextInt();

        System.out.print("Введите вторую последовательность: ");
        double[] b = new double[m];
        for(int i = 0; i < m; ++i) {
            b[i] = in.nextDouble();
        }

        for(double x : b) {

            int pos = getPos(a, 0, n, x);
            System.out.printf("Число %f нужно вставить в позицию между %d и %d\n", x, pos, pos + 1);
        }

    }
}
