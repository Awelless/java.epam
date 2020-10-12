package com.awelless;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //System.out.println("Введите строку:");

        String s = "информатика";

        String out = "";

        String t = s.substring(7, 8);
        out = out.concat(t);
        out = out.concat(s.substring(3, 5));
        out = out.concat(t);

        System.out.println(out);
    }
}
