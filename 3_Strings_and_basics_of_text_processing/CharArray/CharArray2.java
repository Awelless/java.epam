package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static boolean isWord(char[] s, int i) {

        if(s.length - i < 4) {
            return false;
        }

        return s[i] == 'w' && s[i + 1] == 'o' && s[i + 2] == 'r' && s[i + 3] == 'd';
    }

    private static void pushLetter(char[] s, int i) {

        s[i++] = 'l';
        s[i++] = 'e';
        s[i++] = 't';
        s[i++] = 't';
        s[i++] = 'e';
        s[i++] = 'r';
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку: ");
        char[] s = in.nextLine().toCharArray();
        int n = s.length;

        int wordCounter = 0;

        for(int i = 0; i < n; ++i) {

            if(isWord(s, i)) {
                ++wordCounter;
            }
        }

        char[] out = new char[n + 2 * wordCounter];

        int outPtr = 0;
        for(int i = 0; i < n; ++i) {

            if(isWord(s, i)) {
                pushLetter(out, outPtr);
                i += 3;
                outPtr += 6;
            }
            else {
                out[outPtr++] = s[i];
            }
        }

        System.out.println("Новая строка:");
        System.out.println(out);
    }
}
