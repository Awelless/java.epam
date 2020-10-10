package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }

    public static void main(String[] args) {

        System.out.print("Введите количество точек: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Введите координаты точек: ");
        int x[] = new int[n];
        int y[] = new int[n];

        for(int i = 0; i < n; ++i) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        double maxDistance = 0.0;
        int numPoint1 = 0;
        int numPoint2 = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = i + 1; j < n; ++j) {

                double curDistance = distance(x[i], y[i], x[j], y[j]);
                if(curDistance > maxDistance) {
                    maxDistance = curDistance;
                    numPoint1 = i;
                    numPoint2 = j;
                }
            }
        }

        System.out.printf("Наибольшее расстояние между точками: %d(%d, %d) %d(%d, %d)",
                numPoint1 + 1,x[numPoint1], y[numPoint1], numPoint2 + 1, x[numPoint2], y[numPoint2]);
    }
}
