package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    private static int[] buildPrime(int n) {

        //решето Эратосфена
        boolean[] isPrime = new boolean[n + 1];
        for(int i = 2; i <= n; ++i) {
            isPrime[i] = true;
        }

        for(int i = 2; i <= n; ++i) {

            if(isPrime[i]) {
                for(int j = 2 * i; j <= n; j += n) {
                    isPrime[j] = false;
                }
            }
        }

        int size = 0;
        for(int i = 2; i <= n; ++i) {
            if(isPrime[i]) ++size;
        }

        int[] prime = new int[size];
        int ptr = 0;
        for(int i = 2; i <= n; ++i) {
            if(isPrime[i]) prime[ptr++] = i;
        }

        return prime;
    }

    public static void main(String[] args) {

        System.out.print("Введите n: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int prime[] = buildPrime(2 * n);

        System.out.println("Простые числа-близнецы на отрезке с n по 2n: ");
        for(int i = 0; i < prime.length - 1; ++i) {
            if(prime[i] + 2 == prime[i + 1] && prime[i] >= n) System.out.println(prime[i] + " " + prime[i + 1]);
        }

    }
}
