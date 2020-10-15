package com.awelless;

import java.util.Comparator;

public class Customer implements Comparable<Customer>{

    private int id;
    private String surname, name, patronymic;
    private String address;
    private String creditCardNumber, bankAccountNumber;

    Customer() {
        id = 0;
        surname = name = patronymic = address = creditCardNumber = bankAccountNumber = "";
    }

    Customer(int id, String surname, String name, String patronymic,
             String address, String creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        setCreditCardNumber(creditCardNumber);
        this.bankAccountNumber = bankAccountNumber;
    }

    public String toString() {
        return new String(
         "Id: " + id + "\n" +
                "Surname: " + surname + "\n" +
                "Name: " + name + "\n" +
                "Patronymic: " + patronymic + "\n" +
                "Address: " + address + "\n" +
                "Credit card: " + creditCardNumber + "\n" +
                "Bank account number: " + bankAccountNumber + "\n");
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCardNumber(String creditCardNumber) {

        if(isCorrectCreditCard(creditCardNumber)) {
            this.creditCardNumber = creditCardNumber;
        }
        else {
            this.creditCardNumber = "0000000000000000";
        }
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    private boolean isCorrectCreditCard(String number) {

        if(number.length() != 16) {
            return false;
        }

        for(int i = 0; i < 16; ++i) {

            char cur = number.charAt(i);

            if(cur < '0' || '9' < cur) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int compareTo(Customer other) {

        int result = surname.compareTo(other.surname);
        if(result != 0) return result;

        result = name.compareTo(other.name);
        if(result != 0) return result;

        result = patronymic.compareTo(other.patronymic);
        return result;
    }
}
