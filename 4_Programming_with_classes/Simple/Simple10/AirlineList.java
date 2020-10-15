package com.awelless;


import java.util.ArrayList;

public class AirlineList {

    ArrayList<Airline> airlines;

    AirlineList() {
        airlines = null;
    }

    AirlineList(Airline ...airlines) {

        this.airlines = new ArrayList<Airline>();

        for(Airline airline : airlines) {
            this.airlines.add(airline);
        }
    }

    public void add(Airline airline) {
        this.airlines.add(airline);
    }

    public void remove(int voyageNumber) {

        for(Airline airline : airlines) {
            if(airline.getVoyageNumber() == voyageNumber) {
                airlines.remove(airline);
                break;
            }
        }
    }

    public void printByDestinationPoint(String destinationPoint) {

        for(Airline airline : airlines) {
            if(airline.getDestinationPoint().equals(destinationPoint)) {
                System.out.println(airline);
            }
        }
    }

    public void printByDeportationDay(Day deportationDay) {

        for(Airline airline : airlines) {

            boolean isContains = false;
            for(Day day : airline.getDeportationDays()) {
                if(day == deportationDay) {
                    isContains = true;
                    break;
                }
            }

            if(isContains) {
                System.out.println(airline);
            }
        }
    }

    public void printByDeportationDay(Day deportationDay, int timeFromMinutes) {

        for(Airline airline : airlines) {

            boolean isContains = false;
            for(Day day : airline.getDeportationDays()) {

                if(day == deportationDay) {
                    if(airline.getDeportationTime().compareTo(new MyTime(timeFromMinutes)) >= 0) {
                        isContains = true;
                    }
                    break;
                }
            }

            if(isContains) {
                System.out.println(airline);
            }
        }
    }

    public void printByDeportationDay(Day deportationDay, MyTime timeFrom) {

        for(Airline airline : airlines) {

            boolean isContains = false;
            for(Day day : airline.getDeportationDays()) {

                if(day == deportationDay) {
                    if(airline.getDeportationTime().compareTo(timeFrom) >= 0) {
                        isContains = true;
                    }
                    break;
                }
            }

            if(isContains) {
                System.out.println(airline);
            }
        }
    }

}
