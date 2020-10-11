package com.awelless;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = in.nextInt();

        System.out.print("Введите массив: ");
        int a[] = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        int counter[] = new int[n];
        int number[] = new int[n];

        int differentNumbers = 0;

        for(int x : a) {

            int pos = -1;
            for(int i = 0; i < differentNumbers; ++i) {
                if(x == number[i]) {
                    pos = i;
                    break;
                }
            }
            
            if(pos == -1) {
                number[differentNumbers] = x;
                counter[differentNumbers] = 1;
                ++differentNumbers;
            }
            else {
                ++counter[pos];
            }
        }
        
        int mostCommonNumber = number[0];
        int maxCounter = counter[0];
        
        for(int i = 1; i < differentNumbers; ++i) {

            if(counter[i] > maxCounter) {
                maxCounter = counter[i];
                mostCommonNumber = number[i];
            }
            else if(counter[i] == maxCounter) {
                if(number[i] < mostCommonNumber) {
                    mostCommonNumber = number[i];
                }
            }
        }

        System.out.printf("Самое часто встречающееся число %d", mostCommonNumber);
    }
}
