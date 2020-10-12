package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    static boolean isNumber(char c) {
        return c >= '0' && c <='9';
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        char[] s = in.nextLine().toCharArray();

        int numberCounter = 0;
        char prev = 0;
        for(char c : s) {

            if(!isNumber(c)) {
                if(isNumber(prev)) ++numberCounter;
            }

            prev = c;
        }
        if(isNumber(prev)) ++numberCounter;

        System.out.printf("Всего чисел в строке: %d\n", numberCounter);
    }
}
