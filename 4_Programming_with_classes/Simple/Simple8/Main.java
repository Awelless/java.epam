package com.awelless;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer(1,
                "Иванов", "Иван", "Иванович",
                "Гродно, Белые Росы, 2",
                "4137890645673456",
                "BY456982398094395802935");

        Customer c2 = new Customer(2,
                "Гослинг", "Райан", "Томасович",
                "Вашингтон, 38-Авеню",
                "4563986045768730",
                "US54734734UFHJFGFHH");

        Customer c3 = new Customer(3,
                "Машинов", "Алексей", "Михайлович",
                "Москва, ул. Домбровского, 156",
                "5980569378403178",
                "RU4034973039302093203GH");

        Customer c4 = new Customer(4,
                "Шило", "Глеб", "Сергеевич",
                "Гродно, ул. Дзержинского, 58",
                "6780175458679836",
                "BY239U0239G329JG2323UG");

        Shop shop = new Shop(c1, c2, c3);

        shop.printCustomers();
        System.out.println("------------------");

        shop.add(c4);

        shop.printCustomers("4000000000000000", "5000000000000000");
        System.out.println("------------------");

        shop.remove(3);

        shop.printCustomers();
        System.out.println("------------------");
    }
}
