package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    static void swap(int[][] a, int i1, int j1, int i2, int j2) {

        a[i1][j1] += a[i2][j2];
        a[i2][j2] = a[i1][j1] - a[i2][j2];
        a[i1][j1] -= a[i2][j2];

    }

    static int[][] makeOddSquare(int n) {

        int[][] temp = new int[n * 2 - 1][n * 2 - 1];

        int x = n - 1;
        int y = 0;

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                temp[x--][y++] = n * i + j + 1;
            }
            x += n + 1;
            y -= n - 1;
        }

        int[][] out = new int[n][n];
        for(int i = 0; i < 2 * n - 1; ++i) {
            for(int j = 0; j < 2 * n - 1; ++j) {
                if(temp[i][j] > 0) {
                    out[(i - n / 2 + n) % n][(j - n / 2 + n) % n] = temp[i][j];
                }
            }
        }

        return out;
    }

    static int[][] makeEvenOddSquare(int n) {

        int[][] temp = makeOddSquare(n / 2);
        int stage = n * n / 4;

        int[][] out = new int[n][n];

        for(int i = 0; i < n / 2; ++i) {
            for(int j = 0; j < n / 2; ++j) {
                out[i][j] = temp[i][j];
            }
        }

        for(int i = 0; i < n / 2; ++i) {
            for(int j = 0; j < n / 2; ++j) {
                out[n / 2 + i][n / 2 + j] = stage + temp[i][j];
            }
        }

        for(int i = 0; i < n / 2; ++i) {
            for(int j = 0; j < n / 2; ++j) {
                out[i][n / 2 + j] = 2 * stage + temp[i][j];
            }
        }

        for(int i = 0; i < n / 2; ++i) {
            for(int j = 0; j < n / 2; ++j) {
                out[n / 2 + i][j] = 3 * stage + temp[i][j];
            }
        }

        swap(out, 0, 0, n / 2, 0);
        swap(out, n / 2 - 1, 0, n - 1, 0);

        for(int i = 1; i < n / 2 - 1; ++i) {
            swap(out, i, 1, i + n / 2, 1);
        }

        int numColSwap = (n / 2 - 3) / 2;

        for(int j = 0; j < numColSwap; ++j) {
            for(int i = 0; i < n / 2; ++i) {
                swap(out, i, n / 2 - j - 1, i + n / 2, n / 2 - j - 1);
                swap(out, i, n / 2 + j, i + n / 2, n / 2 + j);
            }
        }

        return out;
    }

    static int[][] makeEvenEvenSquare(int n) {

        int[][] out = new int[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                out[i][j] = i * n + j + 1;
            }
        }

        boolean[][] needSwap = new boolean[n][n];
        for(int it = 0; it < n / 4; ++it) {
            for(int i = 0; i < n / 2; ++i) {
                needSwap[i][it * n / 2 + i] = true;
                needSwap[i][n - it * n / 2 - i - 1] = true;
            }
        }

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(needSwap[i][j]) swap(out, i, j, n - i - 1, n - j - 1);
            }
        }

        return out;
    }

    static int[][] makeSquare(int size) {

        if(size % 2 == 1) {
            return makeOddSquare(size);
        }

        size /= 2;
        if(size % 2 == 0) {
            return makeEvenEvenSquare(size * 2);
        }

        return makeEvenOddSquare(size * 2);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер магического квадрата: ");
        int n = in.nextInt();

        int[][] a = makeSquare(n);

        System.out.println("Полученный магический квадрат: ");
        for(int[] x : a) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
