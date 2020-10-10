package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите числа a, b, c: ");

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double num = b + Math.sqrt(Math.pow(b, 2) + 4.0 * a * c);

        if(num != num) {
            System.out.print("Под корнем отрицательное число. Выражение не имеет смысла");
            return;
        }

        double den = 2.0 * a;
		
		if(den == 0) {
            System.out.print("2a равно нулю. Выражение не имеет смысла");
            return;
        }
		
        double ans = num / den - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		if(ans != ans) {
            System.out.print("b равно нулю, ноль нельзя возвести в отрицательную степень. Выражение не имеет смысла");
            return;
        }

        System.out.printf("Ответ равен %f", ans);
    }
}
