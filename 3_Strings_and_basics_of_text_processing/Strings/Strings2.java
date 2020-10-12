package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        StringBuilder s = new StringBuilder(in.nextLine());

        for(int i = 0; i < s.length(); ++i) {

            if(s.charAt(i) == 'a') {
                s.insert(i + 1,'b');
            }
        }

        System.out.println("Полученная строка:");
        System.out.println(s);
    }
}
