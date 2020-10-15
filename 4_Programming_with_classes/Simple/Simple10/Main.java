package com.awelless;

public class Main {

    public static void main(String[] args) {

        Airline a1 = new Airline(
            "Гродно", 1358, PlaneType.PASSENGER,
            new MyTime(9, 40), Day.TUESDAY, Day.FRIDAY
        );

        Airline a2 = new Airline(
                "Минск", 2748, PlaneType.CARGO,
                new MyTime(6, 00), Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY, Day.SATURDAY
        );

        Airline a3 = new Airline(
                "Минск", 5983, PlaneType.PASSENGER,
                new MyTime(12, 45), Day.TUESDAY
        );

        AirlineList airlines = new AirlineList(a1, a2, a3);

        airlines.printByDestinationPoint("Минск");
        System.out.println("---------------");

        airlines.printByDeportationDay(Day.TUESDAY);
        System.out.println("---------------");

        airlines.printByDeportationDay(Day.FRIDAY, new MyTime(7, 30));
        System.out.println("---------------");

        Airline a4 = new Airline(
                "Брест", 3431, PlaneType.PASSENGER,
                new MyTime(11, 30), Day.THURSDAY, Day.FRIDAY
        );

        airlines.add(a4);

        airlines.printByDeportationDay(Day.FRIDAY);
        System.out.println("---------------");

        airlines.remove(2748);

        airlines.printByDeportationDay(Day.FRIDAY);
        System.out.println("---------------");
    }
}
