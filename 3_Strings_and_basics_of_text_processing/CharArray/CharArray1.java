package com.awelless;

import java.sql.SQLOutput;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите количество названий: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Введите названия в стиле camelCase: ");
        char[][] wordsCamel = new char[n][];
        for(int i = 0; i < n; ++i) {
            wordsCamel[i] = in.next().toCharArray();
        }

        char[][] wordsSnake = new char[n][];
        for(int i = 0; i < n; ++i) {

            int upperCounter = 0;

            int m = wordsCamel[i].length;

            for(int j = 0; j < m; ++j) {
                if(wordsCamel[i][j] >= 'A' && wordsCamel[i][j] <= 'Z') {
                    ++upperCounter;
                }
            }

            wordsSnake[i] = new char[m + upperCounter];
            int snakePtr = 0;
            for(int j = 0; j < m; ++j) {

                if(wordsCamel[i][j] >= 'A' && wordsCamel[i][j] <= 'Z') {
                    wordsSnake[i][snakePtr++] = '_';
                    wordsSnake[i][snakePtr++] = Character.toLowerCase(wordsCamel[i][j]);
                }
                else {
                    wordsSnake[i][snakePtr++] = wordsCamel[i][j];
                }
            }
        }

        System.out.println("Названия в стиле snake_case:");
        for(char[] out : wordsSnake) {
            System.out.println(out);
        }
    }
}
