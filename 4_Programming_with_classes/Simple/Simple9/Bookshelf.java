package com.awelless;


import java.util.ArrayList;

public class Bookshelf {

    private ArrayList<Book> books;

    Bookshelf() {
        books = new ArrayList<Book>();
    }

    Bookshelf(Book ...books) {

        this.books = new ArrayList<Book>();

        for(Book book : books) {
            this.books.add(book);
        }
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public void remove(int id) {
        
        for(Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
                break;
            }
        }
    }

    public void printByAuthor(String author) {

        for(Book book : books) {
            if(book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
    }

    public void printByPublishing(String publishing) {

        for(Book book : books) {
            if(book.getPublishing().equals(publishing)) {
                System.out.println(book);
            }
        }
    }

    public void printFromYear(int yearFrom) {

        for(Book book : books) {
            if(book.getYear() >= yearFrom) {
                System.out.println(book);
            }
        }
    }
}
