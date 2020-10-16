package com.awelless;

public class Engine {

    private String manufacturer;
    private int power, fuelConsumption;

    Engine() {
        manufacturer = null;
    }

    Engine(String manufacturer, int power, int fuelConsumption) {
        this.manufacturer = manufacturer;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
