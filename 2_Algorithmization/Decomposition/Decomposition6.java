package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static int gcd(int a, int b) {

        while(a > 0 && b > 0) {
            if(a > b) a %= b;
            else      b %= a;
        }
        return a + b;
    }

    public static boolean isRelativePrime(int a, int b, int c) {

        if(gcd(a, b) + gcd(a, c) + gcd(b, c) == 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
