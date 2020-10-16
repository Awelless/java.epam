package com.awelless;

public class City {

    String name;

    City() {
        name = null;
    }

    City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
