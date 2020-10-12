package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        String s = in.nextLine();

        int maxSpaceLength = 0;
        int curSpaceLength = 0;
        for(int i = 0; i < s.length(); ++i) {

            if(s.charAt(i) == ' ') {
                ++curSpaceLength;
            }
            else {
                maxSpaceLength = max(maxSpaceLength, curSpaceLength);
            }
        }

        System.out.printf("Наибольшее кол-во подряд идущих пробелов: %d", maxSpaceLength);
    }
}
