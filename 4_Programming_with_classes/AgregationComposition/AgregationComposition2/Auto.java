package com.awelless;

public class Auto {

    private String model;
    private Engine engine;
    private Wheels wheels;
    private int fuel;
    private final int maxFuel;

    Auto() {
        model = null;
        engine = null;
        wheels = null;
        fuel = 0;
        maxFuel = 0;
    }

    Auto(String model, Engine engine, Wheels wheels, int maxFuel) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
        this.fuel = 0;
        this.maxFuel = maxFuel;
    }

    public void drive() {

        if (fuel - engine.getFuelConsumption() >= 0) {

            fuel -= engine.getFuelConsumption();

            System.out.println("Машинка едет");
        } else {
            System.out.println("Не хватает бензина, машинка не едет");
        }
    }

    public void refuel(int fuel) {

        if (this.fuel + fuel > maxFuel) {
            System.out.println("Слишком много бензина, остатки вылиты");
        }

        this.fuel += fuel;
    }

    public void changeWheel(WheelType wheelType, Wheel wheel) {

        switch (wheelType) {

            case FRONT_LEFT:  wheels.setFrontLeftWheel(wheel);  break;
            case FRONT_RIGHT: wheels.setFrontRightWheel(wheel); break;
            case BACK_LEFT:   wheels.setBackLeftWheel(wheel);   break;
            case BACK_RIGHT:  wheels.setBackRightWheel(wheel);  break;

            default: break;
        }
    }

    public void printModel() {
        System.out.println(model);
    }
}

enum WheelType {
    FRONT_LEFT,
    FRONT_RIGHT,
    BACK_LEFT,
    BACK_RIGHT
}