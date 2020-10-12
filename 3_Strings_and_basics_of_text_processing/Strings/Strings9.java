package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        String s = in.nextLine();

        int upperCase = 0;
        int lowerCase = 0;

        for(int i = 0; i < s.length(); ++i) {

            char c = s.charAt(i);

            if('A' <= c && c <= 'Z') {
                ++upperCase;
            }
            if('a' <= c && c <= 'z') {
                ++lowerCase;
            }
        }

        System.out.printf("Больших букв: %d\n", upperCase);
        System.out.printf("Маленьких букв: %d\n", lowerCase);
    }
}
