package com.awelless;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto(
            "Tesla Cybertruck", new Engine("Tesla", 480, 6),
                new Wheels("Tesla"), 100
        );

        auto.printModel();

        auto.refuel(70);

        auto.drive();
        auto.drive();
        auto.drive();

        auto.changeWheel(WheelType.BACK_LEFT, new Wheel("Chevrolet"));

        auto.drive();
        auto.drive();
        auto.drive();
        auto.drive();
        auto.drive();
        auto.drive();
        auto.drive();
        auto.drive();
        auto.drive();

        auto.refuel(120);
    }
}
