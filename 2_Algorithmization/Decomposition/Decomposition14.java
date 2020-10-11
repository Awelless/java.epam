package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static int getLength(int x) {

        int length = 0;
        while(x > 0) {
            x /= 10;
            ++length;
        }
        return length;
    }

    private static boolean isArmstrongNumber(int x) {

        int _x = x;

        int length = getLength(x);

        int sumNum = 0;
        while(x > 0) {
            sumNum += pow(x % 10, length);
            x /= 10;
        }

        return sumNum == _x;
    }

    public static void main(String[] args) {

        System.out.print("Введите k: ");

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        System.out.print("Числа Армстронга от 1 до k: ");
        for(int i = 1; i <= k; ++i) {
            if(isArmstrongNumber(i)) System.out.print(i + " ");
        }
    }
}
