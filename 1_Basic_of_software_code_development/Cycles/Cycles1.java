package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите число: ");

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int ans = 0;
        for(int i = 1; i <= x; ++i) {
            ans += i;
        }

        System.out.printf("Ответ равен %d", ans);
    }
}
