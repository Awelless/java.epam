package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        char[] s = in.nextLine().toCharArray();

        char[] out = new char[s.length];
        int outPtr = 0;
        int sPtr = 0;

        for ( ; sPtr < s.length && s[sPtr] == ' '; ++sPtr) { }

        char prev = 0;
        for( ; sPtr < s.length; ++sPtr) {

            if(s[sPtr] != ' ' || prev != ' ') {
                out[outPtr++] = s[sPtr];
                prev = s[sPtr];
            }
        }

        for(int i = outPtr - 1; i >= 0 && out[i] == ' '; --i) {
            out[i] = (char)-1;
        }

        System.out.println("Полученная строка:");
        for(int i = 0; i < out.length && out[i] != (char)-1; ++i) {
            System.out.print(out[i]);
        }
    }
}
