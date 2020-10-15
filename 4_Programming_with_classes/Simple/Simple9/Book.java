package com.awelless;

import java.util.Comparator;

public class Book {

    private int id, year, numPages, cost;
    private String name, author, publishing;
    Binding binding;

    Book() {
        id = year = numPages = cost = 0;
        name = author = publishing = "";
        binding = Binding.HARD;
    }

    Book(int id, String name, String author, String publishing,
         int year, int numPages, int cost, Binding binding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.numPages = numPages;
        this.cost = cost;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getYear() {
        return year;
    }

    public int getNumPages() {
        return numPages;
    }

    public int getCost() {
        return cost;
    }

    public Binding getBinding() {
        return binding;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {

        String binding = null;

        switch(this.binding) {

            case HARD:   binding = "Твердый";   break;
            case SOFT:   binding = "Мягкий";   break;
            case SPRING: binding = "Пружинный"; break;

            default: break;
        }

        return new String(
        "Id: "  + id + "\n" +
               "Название: " + name + "\n" +
               "Автор: " + author + "\n" +
               "Издатель: " + publishing + "\n" +
               "Год издания: " + year + "\n" +
               "Всего страниц: " + numPages + "\n" +
               "Цена: " + cost + "\n" +
               "Переплет: " + binding + "\n"
        );
    }
}

enum Binding {
    HARD,
    SOFT,
    SPRING
}
