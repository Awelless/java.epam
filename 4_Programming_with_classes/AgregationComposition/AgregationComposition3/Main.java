package com.awelless;

public class Main {

    public static void main(String[] args) {

        City city1 = new City(
                "Гродно"
        );

        City city2 = new City(
                "Минск"
        );

        City city3 = new City(
                "Брест"
        );

        City city4 = new City(
                "Гожа"
        );

        City city5 = new City(
                "Воложин"
        );

        City city6 = new City(
                "Борисов"
        );

        City city7 = new City(
                "Пинск"
        );

        Area area1 = new Area(
                6, city1, city4
        );

        Area area2 = new Area(
                7, city2, city5, city6
        );

        Area area3 = new Area(
                5, city3, city7
        );

        Region region1 = new Region(
                city2, area1, area2
        );

        Region region2 = new Region(
                city3, area3
        );

        Country country = new Country(
                city2, region1, region2
        );

        country.printCenter();
        country.printRegionNumber();
        country.printSquare();
        country.printRegionCenters();
    }
}
