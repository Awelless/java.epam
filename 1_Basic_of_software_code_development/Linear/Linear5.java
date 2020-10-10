package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите число:  ");

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int h = t / 3600;
        int m = (t / 60) % 60;
        int s = t % 60;

        System.out.printf("Ответ: %02dч %02dм %02dс", h, m ,s);
    }
}
