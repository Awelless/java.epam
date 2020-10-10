package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите координаты x, y первой точки: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.print("Введите координаты x, y второй точки: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        System.out.print("Введите координаты x, y третьей точки: ");
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        //разбираем случай для одинаковых x-координат отдельно,
        // т.к. при одинаковых x нельзя представить прямую как функцию y = kx + b
        if(x1 == x2 || x1 == x3 || x2 == x3) {

            if(x1 == x2 && x1 == x3) {
                System.out.println("Эти точки расположены на одной прямой");
                return;
            }
            //если x-координаты равны только у двух точек из трех,
            //то эти три точки никогда не будут лежать на одной прямой
            else {
                System.out.println("Эти точки не расположены на одной прямой");
                return;
            }

        }

        //получаем k-коэффициент (y = kx + b) для прямой AB
        double kAB = (y2 - y1) / (x2 - x1);

        //получаем k-коэффициент (y = kx + b) для прямой AC
        double kAC = (y3 - y1) / (x3 - x1);

        if(kAB == kAC) {
            System.out.println("Эти точки расположены на одной прямой");
        }
        else {
            System.out.println("Эти точки не расположены на одной прямой");
        }
    }
}
