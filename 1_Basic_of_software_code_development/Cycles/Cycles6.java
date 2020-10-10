package com.awelless;

public class Main {

    public static void main(String[] args) {

        System.out.println("Список ASCII кодов и символов, которые они обозначают");

        for (int i = 0; i < 255; ++i) {
            System.out.println(i + " " + (char)i);
        }
    }
}
