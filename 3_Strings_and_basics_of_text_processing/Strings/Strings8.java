package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        String s = in.nextLine();

        if(s.indexOf(' ') == -1) {
            System.out.println("Самое длинное слово:");
            System.out.println(s);
            return;
        }

        int maxLength = 0;
        int startPos = 0;

        int prevIndex = 0;

        while(true) {

            int index = s.indexOf(' ', prevIndex);

            if(index == -1) {
                if(s.length() - prevIndex > maxLength) {
                    maxLength = s.length() - prevIndex;
                    startPos = prevIndex;
                }
                break;
            }

            if(index - prevIndex > maxLength) {
                maxLength = index - prevIndex;
                startPos = prevIndex;
            }

            prevIndex = index + 1;
        }

        System.out.println("Самое длинное слово:");
        System.out.println(s.substring(startPos, startPos + maxLength));
    }
}
