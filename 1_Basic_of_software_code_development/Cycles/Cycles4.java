package com.awelless;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        System.out.print("Сумма квадратов первых двухсот чисел: ");

        BigInteger ans = BigInteger.valueOf(1);

        for(int i = 1; i <= 200; ++i) {
            ans = ans.multiply(BigInteger.valueOf(i * i));
        }

        System.out.print(ans);
    }
}
