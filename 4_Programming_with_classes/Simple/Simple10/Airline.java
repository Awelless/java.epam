package com.awelless;

import java.util.Arrays;

public class Airline {

    private String destinationPoint;
    private int voyageNumber;
    private PlaneType planeType;
    private MyTime deportationTime;
    private Day[] deportationDays;

    Airline() {
        destinationPoint = null;
        voyageNumber = 0;
        deportationTime = null;
        deportationDays = null;
        planeType = PlaneType.OTHER;
    }

    Airline(String destinationPoint, int voyageNumber,
            PlaneType planeType, MyTime deportationTime,
            Day ...deportationDays) {
        this.destinationPoint = destinationPoint;
        this.voyageNumber = voyageNumber;
        this.planeType = planeType;
        this.deportationTime = deportationTime;
        setDeportationDays(deportationDays);
    }

    Airline(String destinationPoint, int voyageNumber,
            PlaneType planeType, int deportationTimeMinutes,
            Day ...deportationDays) {
        this.destinationPoint = destinationPoint;
        this.voyageNumber = voyageNumber;
        this.planeType = planeType;
        this.deportationTime = new MyTime(deportationTimeMinutes);
        this.deportationDays = deportationDays;
        setDeportationDays(deportationDays);
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public int getVoyageNumber() {
        return voyageNumber;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public MyTime getDeportationTime() {
        return deportationTime;
    }

    public Day[] getDeportationDays() {
        return deportationDays;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public void setVoyageNumber(int voyageNumber) {
        this.voyageNumber = voyageNumber;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public void setDeportationTime(int h, int m) {
        this.deportationTime = new MyTime(h, m);
    }

    public void setDeportationTime(MyTime deportationTime) {
        this.deportationTime = deportationTime;
    }

    public void setDeportationDays(Day ...deportationDays) {
        this.deportationDays = deportationDays;
        Arrays.sort(this.deportationDays);
    }

    @Override
    public String toString() {

        String planeType = null;
        switch(this.planeType) {

            case PASSENGER: planeType = "Пассажирский"; break;
            case CARGO:     planeType = "Грузовой";     break;

            default: planeType = "Другой"; break;
        }

        StringBuilder deportationDays = new StringBuilder();
        for(Day day : this.deportationDays) {

            if(deportationDays.length() > 0) {
                deportationDays.append(", ");
            }

            switch(day) {

                case MONDAY:    deportationDays.append("Пн"); break;
                case TUESDAY:   deportationDays.append("Вт"); break;
                case WEDNESDAY: deportationDays.append("Ср"); break;
                case THURSDAY:  deportationDays.append("Чт"); break;
                case FRIDAY:    deportationDays.append("Пт"); break;
                case SATURDAY:  deportationDays.append("Сб"); break;
                case SUNDAY:    deportationDays.append("Вс"); break;

                default: break;
            }

        }

        return new String(
     "Пункт назначения: " + destinationPoint + "\n" +
            "Номер рейса: " + voyageNumber + "\n" +
            "Тип самолета: " + planeType  + "\n" +
            "Время отправления: " + deportationTime + "\n" +
            "Дни отправления: " + deportationDays + "\n"
        );
    }
}

class MyTime implements Comparable<MyTime>{

    private int h, m;

    MyTime(int m) {
        this.h = m / 60;
        this.m = m % 60;
    }

    MyTime(int h, int m) {
        this.h = h;
        this.m = m;
    }

    public void setTime(int m) {
        this.h = m / 60;
        this.m = m % 60;
    }

    public void setTime(int h, int m) {
        this.h = h;
        this.m = m;
    }

    @Override
    public String toString() {

        StringBuilder out = new StringBuilder();

        if(h < 10) {
            out.append("0");
        }
        out.append(h + ":");
        if(m < 10) {
            out.append("0");
        }
        out.append(m);

        return out.toString();
    }

    @Override
    public int compareTo(MyTime other) {
        return h * 60 + m - other.h * 60 - other.m;
    }
}

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum PlaneType {
    PASSENGER,
    CARGO,
    OTHER
}
