package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        String s = in.nextLine();

        int aCounter = 0;

        int prevIndex = 0;
        while(true) {

            prevIndex = s.indexOf('a', prevIndex) + 1;
            if(prevIndex == 0) break;

            ++aCounter;
        }
        
        while(true) {

            prevIndex = s.indexOf('а', prevIndex) + 1;
            if(prevIndex == 0) break;

            ++aCounter;
        }

        System.out.printf("Количество букв a в строке: %d", aCounter);
    }
}
