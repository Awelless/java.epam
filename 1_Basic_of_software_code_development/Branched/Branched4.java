package com.awelless;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    private static boolean pushSuccessful(double a, double b, double x, double y) {

        /* задача сводится к подзадаче:
         * влезет ли прямоугольник с размерами x y
         * в прямоугольник с размерами a b
         * -------------------------------------------------
         *изначально сторона с размером x параллельна стороне с размером a
         *        и сторона с размером y параллельна стороне с размером b
         *--------------------------------------------------
         * т.к. эта функция ставит прямоугольник именно таким образом,
         * имеет значение, в каком порядке передаются аргументы
         */


        if(x > a && y > b) {
            return false;
        }

        if(x <= a) {
            if(y <= b) {
                return true;
            }
            /* наклоняем прямоугольник так,
             * чтобы его проекция на сторону b равнялась b
             * после чего сравниваем проекцию на сторону a со стороной a
             */
            else {
                double bY = b * y/ (x + y);
                double aX = b * x / (x + y);
                double aY = sqrt(pow(y, 2) - pow(bY, 2));

                if(aX + aY <= a) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размеры отверстия: ");
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.print("Введите размеры кирпича: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        if(pushSuccessful(a, b, x, y) || pushSuccessful(a, b, y, x) ||
           pushSuccessful(a, b, x, z) || pushSuccessful(a, b, z, x) ||
           pushSuccessful(a, b, y, z) || pushSuccessful(a, b, z, y)) {
            System.out.println("Кирпич пройдет через отверстие");
        }
        else {
            System.out.println("Кирпич не пройдет через отверстие");
        }

    }
}
