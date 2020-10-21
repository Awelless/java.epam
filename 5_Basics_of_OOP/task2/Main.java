package com.awelless;

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.addProduct("Meat", 12);
        payment.addProduct("Milk", 7);
        payment.addProduct("Pasta", 4);

        System.out.println(payment);

        payment.removeProduct("Milk");

        System.out.println(payment);
    }
}
