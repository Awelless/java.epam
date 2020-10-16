package com.awelless;

public class Account implements Comparable<Account>{

    public boolean isBlocked;
    private int sum;
    private final int id;

    Account() {
        isBlocked = false;
        sum = 0;
        id = 0;
    }

    Account(int id) {
        this.isBlocked = false;
        this.sum = 0;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void put(int sum) {
        if(isBlocked) {
            System.out.println("Нельзя положить деньги, аккаунт заблокирован");
        } else {
            this.sum += sum;
        }
    }

    public void take(int sum) {
        if(isBlocked) {
            System.out.println("Нельзя снять деньги, аккаунт заблокирован");
        } else {
            this.sum -= sum;
        }
    }

    @Override
    public int compareTo(Account other) {
        return id - other.id;
    }
}
