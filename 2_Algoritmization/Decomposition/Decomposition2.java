package com.awelless;

import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Main {

    public static int gcd(int a, int b) {

        while(a > 0 && b > 0) {

            if(a > b) a %= b;
            else      b %= a;
        }

        return a + b;
    }

    public static int gcd(int a, int b, int c, int d) {

        return gcd(gcd(a, b), gcd(c, d));
    }

    public static void main(String[] args) {
        

    }
}
