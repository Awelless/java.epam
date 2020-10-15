package com.awelless;

import java.util.Comparator;

public class Train {

    String destinationPoint;
    int number;
    int departureTime;

    Train() {
        destinationPoint = "";
        number = 0;
        departureTime = 0;
    }

    Train(String _destination, int _number, String _departure) {
        destinationPoint = _destination;
        number = _number;
        departureTime = timeToInt(_departure);
    }

    private int timeToInt(String time) {
        int h = Character.getNumericValue(time.charAt(0)) * 10 + Character.getNumericValue(time.charAt(1));
        int m = Character.getNumericValue(time.charAt(3)) * 10 + Character.getNumericValue(time.charAt(4));
        int s = Character.getNumericValue(time.charAt(6)) * 10 + Character.getNumericValue(time.charAt(7));
        return h * 3600 + m * 60 + s;
    }

    public int getNumber() {
        return number;
    }

    private void printTime() {
        int h = departureTime / 3600;
        int m = departureTime / 60 % 60;
        int s = departureTime % 60;
        System.out.printf("Время отправки: %02d:%02d:%02d\n", h, m, s);
    }

    public void print() {
        System.out.println("Номер поезда: " + number);
        System.out.println("Пункт назначения: " + destinationPoint);
        printTime();
    }
}

class NumberComparator implements Comparator<Train> {

    @Override
    public int compare(Train a, Train b) {

        if(a.number > b.number) {
            return 1;
        }
        if(a.number < b.number) {
            return -1;
        }
        return 0;
    }
}

class DestinationComparator implements Comparator<Train> {

    @Override
    public int compare(Train a, Train b) {

        int result = a.destinationPoint.compareTo(b.destinationPoint);

        if(result != 0) return result;

        if(a.departureTime > b.departureTime) {
            return 1;
        }
        if(a.departureTime < b.departureTime) {
            return -1;
        }
        return 0;
    }
}

