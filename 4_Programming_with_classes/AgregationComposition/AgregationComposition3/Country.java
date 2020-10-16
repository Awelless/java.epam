package com.awelless;

public class Country implements AbstractArea {

    private City center;
    private Region[] regions;
    private final int square;

    Country() {
        center = null;
        regions = null;
        square = 0;
    }

    Country(City center, Region ...regions) {
        this.center = center;
        this.regions = regions;

        int square = 0;
        for(Region region : regions) {
            square += region.getSquare();
        }
        this.square = square;
    }

    @Override
    public void printCenter() {
        System.out.println("Столица: " + center);
    }

    @Override
    public void printSquare() {
        System.out.println("Площадь: " + square);
    }

    @Override
    public int getSquare() {
        return square;
    }

    public void printRegionNumber() {
        System.out.println("Количество областей: " + regions.length);
    }

    public void printRegionCenters() {
        System.out.print("Областные центры: ");
        for(Region region : regions) {
            region.printCenter();
            System.out.print(" ");
        }
    }
}
