package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static int sumNums(int x) {

        int sum = 0;
        while(x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    private static int subtract(int x) {

        if(x == 0) {
            return 0;
        }

        int y = sumNums(x);

        return 1 + subtract(x - y);
    }

    public static void main(String[] args) {

        System.out.print("Введите число: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.printf("Всего операций: %d", subtract(n));
    }
}
