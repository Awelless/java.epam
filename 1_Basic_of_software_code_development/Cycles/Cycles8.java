package com.awelless;


import java.util.Scanner;

public class Main {

    private static boolean numIn(int base, int a) {

        while(a > 0) {

            if(a % 10 == base) {
                return true;
            }
            a /= 10;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("Введите два числа: ");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.print("Список цифр, которые содержатся в обоих числах");

        for(int num = 0; num <= 9; ++num) {

            if(numIn(num, a) && numIn(num, b)) {
                System.out.print(" " + num);
            }
        }
    }
}
