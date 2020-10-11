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

    public static int lcm(int a, int b) {

        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {





    }
}
