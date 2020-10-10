package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static boolean isRow(int x) {

        int prev = 10;
        while(x > 0) {

            int cur = x % 10;

            if(cur >= prev) return false;

            prev = cur;
            x /= 10;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.print("Введите n: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("n-значные числа, цифры которых образуют строго возрастающую последовательность: ");
        for(int i = (int)pow(10, n - 1); i < pow(10, n); ++i) {
            if(isRow(i)) System.out.print(i + " ");
        }
    }
}
