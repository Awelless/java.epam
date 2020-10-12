package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку:");
        StringBuilder s1 = new StringBuilder(in.nextLine());

        StringBuilder s2 = new StringBuilder(s1);
        s2.reverse();

        if(s1.compareTo(s2) == 0) {
            System.out.println("Является палиндромом");
        }
        else {
            System.out.println("Не является палиндромом");
        }
    }
}
