package com.awelless;

public class Main {

    public static void main(String[] args) {

        System.out.print("Сумма квадратов первых ста чисел: ");

        int ans = 0;

        for(int i = 1; i <= 100; ++i) {
            ans += i * i;
        }

        System.out.print(ans);
    }
}
