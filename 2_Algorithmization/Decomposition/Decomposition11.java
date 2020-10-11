package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static int[] parse(int x) {

        int _x = x;
        int size = 0;
        while(_x > 0) {
            _x /= 10;
            ++size;
        }

        int[] out = new int[size];
        for(int i = size - 1; i >= 0; --i) {
            out[i] = x % 10;
            x /= 10;
        }

        return out;
    }

    public static void main(String[] args) {

        System.out.print("Введите два числа: ");

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[] numsM = parse(m);
        int[] numsN = parse(n);

        if(numsM.length > numsN.length) {
            System.out.println("В первом числе цифр больше");
        }
        else if(numsM.length < numsN.length) {
            System.out.println("Во втором числе цифр больше");
        }
        else {
            System.out.println("В двух числах одинаковое количество цифр");
        }
    }
}
