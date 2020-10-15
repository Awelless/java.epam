package com.awelless;

import java.util.Comparator;
import java.util.TreeSet;

public class Shop {

    private TreeSet<Customer> customers;

    Shop() {
        this.customers = new TreeSet<Customer>();
    }

    Shop(Customer ...customers) {
        this.customers = new TreeSet<Customer>();
        for(Customer customer : customers) {
            this.customers.add(customer);
        }
    }

    public void add(Customer customer) {
        this.customers.add(customer);
    }

    public void remove(int id) {

        for(Customer customer : customers) {
            if(customer.getId() == id) {
                customers.remove(customer);
                break;
            }
        }
    }

    public void printCustomers() {
        for(Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void printCustomers(String cardFrom, String cardTo) {

        for(Customer customer : customers) {

            if(customer.getCreditCardNumber().compareTo(cardFrom) >= 0 &&
               customer.getCreditCardNumber().compareTo(cardTo) <= 0) {
                System.out.println(customer);
            }
        }
    }
}
