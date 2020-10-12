package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    static int count(String s, char c) {

        int counter = 0;

        int index = 0;
        while(true) {

            index = s.indexOf(c, index) + 1;
            if(index == 0) break;

            ++counter;
        }

        return counter;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        String s = in.nextLine();

        int sentences = count(s, '.') +
                        count(s, '!') +
                        count(s, '?');

        System.out.printf("Предложений: %d\n", sentences);

    }
}
