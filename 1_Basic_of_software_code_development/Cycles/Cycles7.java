package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите числа m, n: ");

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        for(int curNum = m; curNum <= n; ++curNum) {

            System.out.printf("Делители числа %d:", curNum);
            for(int i = 2; i <= curNum / 2; ++i) {
                if(curNum % i == 0) {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
        }
    }
}
