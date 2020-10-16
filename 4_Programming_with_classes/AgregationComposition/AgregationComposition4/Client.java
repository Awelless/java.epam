package com.awelless;

import java.util.Map;
import java.util.TreeMap;

public class Client {

    TreeMap<Integer, Account> accounts;

    Client() {
        accounts = new TreeMap<Integer, Account>();
    }

    Client(Account ...accounts) {
        this.accounts = new TreeMap<Integer, Account>();

        for(Account account : accounts) {
            this.accounts.put(account.getId(), account);
        }
    }

    public void blockAccount(int id) {
        Account account = getAccount(id);
        account.isBlocked = true;
    }

    public void unblockAccount(int id) {
        Account account = getAccount(id);
        account.isBlocked = false;
    }

    public Account getAccount(int id) {
        return accounts.get(id);
    }

    public int getNegativeSum() {
        return getSumBySign(-1);
    }

    public int getPositiveSum() {
        return getSumBySign(1);
    }

    public int getSumBySign(int sign) {

        int sum = 0;
        for(Map.Entry<Integer, Account> account : accounts.entrySet()) {

            int curSum = account.getValue().getSum();
            if(curSum * sign > 0) {
                sum += curSum;
            }
        }

        return sum;
    }

    public int getSum() {
        return getNegativeSum() + getPositiveSum();
    }

}
