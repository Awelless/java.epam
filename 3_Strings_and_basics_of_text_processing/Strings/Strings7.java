package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        StringBuilder s = new StringBuilder(in.nextLine());

        while(true) {
            int index = s.indexOf(" ");
            if(index == -1) break;

            s.deleteCharAt(index);
        }

        for(int i = 0; i < s.length(); ++i) {

            while(true) {
                int index = s.indexOf(Character.toString(s.charAt(i)), i + 1);
                if(index == -1) break;

                s.deleteCharAt(index);
            }
        }

        System.out.println("Полученная строка:");
        System.out.println(s);
    }
}
