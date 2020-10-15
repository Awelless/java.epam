package com.awelless;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book(
                1, "Граф Монте-Кристо", "А. Дюма", "Краснодар",
                1983, 656, 12, Binding.HARD
        );

        Book b2 = new Book(
                2, "Чешский. Шаг за шагом", "Л. Хола", "Прага",
                2008, 123, 40, Binding.SOFT
        );

        Book b3 = new Book(
                3, "Практикум по ИКГ", "Т. Марамыгина", "БГУИР",
                2020, 36, 7, Binding.SPRING
        );

        Bookshelf bookshelf = new Bookshelf(b1, b2, b3);

        bookshelf.printByAuthor("А. Дюма");
        System.out.println("------------------");
        bookshelf.printByPublishing("Прага");
        System.out.println("------------------");
        bookshelf.printFromYear(2000);
        System.out.println("------------------");

        Book b4 = new Book(
                4, "Основы ООП на С++", "Р. Лафоре", "Питер",
                2013, 896, 70, Binding.HARD
        );

        bookshelf.add(b4);

        bookshelf.printFromYear(1960);
        System.out.println("------------------");

        bookshelf.remove(3);

        bookshelf.printFromYear(1960);
        System.out.println("------------------");

    }
}
