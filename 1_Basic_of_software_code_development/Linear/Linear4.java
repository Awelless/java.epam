package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите число:  ");

        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();

        int temp = (int)Math.round(r * 1000);

        int n = temp % 1000;
        int d = temp / 1000;

        System.out.printf("Ответ: %d.%03d", n, d);
    }
}
