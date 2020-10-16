package com.awelless;

public class Area implements AbstractArea {

    private City center;
    private City[] cities;
    private final int square;

    Area() {
        center = null;
        cities = null;
        square = 0;
    }

    Area(int square, String center, City ...others) {
        this.center = new City(center);
        this.square = square;

        this.cities = new City[others.length + 1];
        for(int i = 0; i < others.length; ++i) {
            this.cities[i] = others[i];
        }
        this.cities[others.length] = this.center;
    }

    Area(int square, City center, City ...others) {
        this.center = center;
        this.square = square;

        this.cities = new City[others.length + 1];
        for(int i = 0; i < others.length; ++i) {
            this.cities[i] = others[i];
        }
        this.cities[others.length] = this.center;
    }

    @Override
    public void printCenter() {
        System.out.print(center);
    }

    @Override
    public void printSquare() {
        System.out.print(square);
    }

    @Override
    public int getSquare() {
        return square;
    }
}
