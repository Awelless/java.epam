package com.awelless;

import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int N = 10;
        int M = 20;

        int a[][] = new int[N][M];
        for(int i = 0; i < N; ++i) {
            for(int j = 0; j < M; ++j) {
                a[i][j] = random.nextInt(15);
            }
        }

        System.out.println("Полученная матрица:");
        for(int x[] : a) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.print("Номера строк, в которых 5 встречается 3 и более раза: ");
        for(int i = 0; i < N; ++i) {

            int counter = 0;
            for(int x : a[i]) {
                if(x == 5) ++counter;
            }

            if(counter >= 3) System.out.print(i + " ");
        }
    }
}
