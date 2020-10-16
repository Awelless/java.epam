package com.awelless;

public class Main {

    public static void main(String[] args) {

        Client client = new Client(
           new Account(1), new Account(2)
        );

        Account account1 = client.getAccount(1);
        Account account2 = client.getAccount(2);

        account1.put(10);
        account2.take(5);

        System.out.println(client.getSum());
        System.out.println(client.getPositiveSum());
        System.out.println(client.getNegativeSum());

        client.blockAccount(1);
        account1.put(10);

        System.out.println(client.getSum());
    }
}
