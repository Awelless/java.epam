package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        String s = in.nextLine();

        StringBuilder out = new StringBuilder("");
        for(int i = 0; i < s.length(); ++i) {
            out.append(s.charAt(i));
            out.append(s.charAt(i));
        }

        System.out.println("Полученная строка:");
        System.out.println(out);
    }
}
