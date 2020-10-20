package com.awelless;

public class Main {

    public static void main(String[] args) {

        Directory directory = new Directory("E:\\test\\anime\\boku no pico");

        TextFile file = TextFile.create(directory, "ohayo");
        file.addContents("I hate anime. UwU");

        System.out.println(file.toString());

        file.rename("oh no");

        System.out.println(file.toString());

        try {
            file.printContents();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        file.delete();

        try {
            file.printContents();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
