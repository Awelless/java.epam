package com.awelless;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите число e: ");

        Scanner in = new Scanner(System.in);
        double e = in.nextDouble();

        System.out.printf("Сумма членов последовательности, модуль которых больше e = %f равен ", e);

        //если e <= 0, то ответ - сумма бесконечного количества членов
        if(e <= 0) {
            //посчитано с помощью калькулятора
            System.out.print(2.84699097000782072187215332816);
            return;
        }

        double ans = 0;
        for(int i = 1; ; ++i) {

            double curVal = 1.0 / pow(2, i) + 1.0 / pow(3, i);
            if(curVal < e) {
                break;
            }

            ans += curVal;
        }

        System.out.print(ans);

    }
}
