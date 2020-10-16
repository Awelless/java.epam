package com.awelless;

public class Wheels {

    private Wheel frontLeftWheel, frontRightWheel,
                  backLeftWheel, backRightWheel;

    Wheels() {
        frontLeftWheel = null;
        frontRightWheel = null;
        backLeftWheel = null;
        backRightWheel = null;
    }

    Wheels(String wheelsManufacturer) {
        this.frontLeftWheel  = new Wheel(wheelsManufacturer);
        this.frontRightWheel = new Wheel(wheelsManufacturer);
        this.backLeftWheel   = new Wheel(wheelsManufacturer);
        this.backRightWheel  = new Wheel(wheelsManufacturer);
    }

    Wheels(String flWheelManufacturer, String frWheelManufacturer,
           String blWheelManufacturer, String brWheelManufacturer) {
        this.frontLeftWheel  = new Wheel(flWheelManufacturer);
        this.frontRightWheel = new Wheel(frWheelManufacturer);
        this.backLeftWheel   = new Wheel(blWheelManufacturer);
        this.backRightWheel  = new Wheel(brWheelManufacturer);
    }

    Wheels(Wheel frontLeftWheel, Wheel frontRightWheel,
           Wheel backLeftWheel, Wheel backRightWheel) {
        this.frontLeftWheel = frontLeftWheel;
        this.frontRightWheel = frontRightWheel;
        this.backLeftWheel = backLeftWheel;
        this.backRightWheel = backRightWheel;
    }

    public Wheel getFrontLeftWheel() {
        return frontLeftWheel;
    }

    public Wheel getFrontRightWheel() {
        return frontRightWheel;
    }

    public Wheel getBackLeftWheel() {
        return backLeftWheel;
    }

    public Wheel getBackRightWheel() {
        return backRightWheel;
    }

    public void setFrontLeftWheel(Wheel frontLeftWheel) {
        this.frontLeftWheel = frontLeftWheel;
    }

    public void setFrontRightWheel(Wheel frontRightWheel) {
        this.frontRightWheel = frontRightWheel;
    }

    public void setBackLeftWheel(Wheel backLeftWheel) {
        this.backLeftWheel = backLeftWheel;
    }

    public void setBackRightWheel(Wheel backRightWheel) {
        this.backRightWheel = backRightWheel;
    }
}
