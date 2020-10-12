package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        char[] s = in.nextLine().toCharArray();

        int numberCounter = 0;
        for(char c : s) {
            if(c >= '0' && c <= '9') ++numberCounter;
        }

        System.out.printf("Всего цифр в строке: %d\n", numberCounter);
    }
}
