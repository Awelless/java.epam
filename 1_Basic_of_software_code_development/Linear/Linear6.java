package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите координаты x, y: ");

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        boolean ans = false;
        ans = (y >= 0 && y<= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4 && !(x == 0 && y == -1));

        System.out.print("Ответ: ");
        System.out.println(ans);
    }
}
