package com.awelless;

public class Main {

    public static void main(String[] args) {

        Calendar calendar = new Calendar();

        calendar.addSpecialDay("01.01", "New Year");
        calendar.addSpecialDay("17.12", "Birthday");
        calendar.addSpecialDay("01.06", "Summer");

        System.out.println(calendar);

        calendar.removeSpecialDay("01.06");

        System.out.println(calendar);

    }
}
