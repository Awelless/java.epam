package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите два угла (в градусах): ");

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        double c = 180.0 - a - b;

        if(a < 0 || b < 0 || c < 0) {
            System.out.println("Треугольник с заданными углами не существует");
        }
        else {

            System.out.println("Треугольник с заданными углами существует");

            if(a == 90 || b == 90 || c == 90) {
                System.out.println("Треугольник является прямоугольным");
            }
        }
    }
}
