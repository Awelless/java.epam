package com.awelless;

public class Region implements AbstractArea {

    private City center;
    private Area[] areas;
    private final int square;

    Region() {
        center = null;
        areas = null;
        square = 0;
    }

    Region(City center, Area ...areas) {
        this.center = center;
        this.areas = areas;

        int square = 0;
        for(Area area : areas) {
            square += area.getSquare();
        }
        this.square = square;
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
