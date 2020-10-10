package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.print("Введите числа a, b, c: ");

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double z = ((a - 3) * b / 2) + c;
        System.out.printf("Z равно: %f", z);
    }
}
