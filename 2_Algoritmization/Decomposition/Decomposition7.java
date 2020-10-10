package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static int fact(int a) {

        int mult = 1;
        for(int i = 1; i <= a; ++i) {
            mult *= i;
        }
        return mult;
    }

    public static int sumOddFact() {

        int sum = 0;
        for(int i = 1; i <= 9; i += 2) {
            sum += fact(i);
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
