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

        System.out.print("Введите число: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ans = parse(n);

        System.out.print("Полученный массив: ");
        for(int x : ans) {
            System.out.print(x + " ");
        }
    }
}
