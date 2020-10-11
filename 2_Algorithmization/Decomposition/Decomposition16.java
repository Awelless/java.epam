package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static int evenQuantity(int x) {

        int counter = 0;
        while(x > 0) {

            int cur = x % 10;

            if(cur % 2 == 0) ++counter;

            x /= 10;
        }

        return counter;
    }

    private static boolean isAllNumsOdd(int x) {
        return evenQuantity(x) == 0;
    }

    public static void main(String[] args) {

        System.out.print("Введите n: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 0;
        for(int i = (int)pow(10, n - 1); i < pow(10, n); ++i) {
            if(isAllNumsOdd(i)) sum += i;
        }

        System.out.printf("Полученная сумма: %d\n", sum);
        System.out.printf("Четных цифр в найденной сумме: %d\n", evenQuantity(sum));
    }
}
