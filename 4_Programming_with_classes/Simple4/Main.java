package com.awelless;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Train[] trains = new Train[] {
            new Train("Гродно", 45, "12:00:00"),
            new Train("Минск",  15, "13:45:00"),
            new Train("Лида",   12, "10:50:00"),
            new Train("Орша",   38, "11:35:00"),
            new Train("Брест",  26, "12:30:00")
        };

        Arrays.sort(trains, new NumberComparator());
        /*for(Train x : trains) {
            x.print();
            System.out.println();
        }
        System.out.println("-------------------");*/

        Arrays.sort(trains, new DestinationComparator());
        /*for(Train x : trains) {
            x.print();
            System.out.println();
        }*/

        System.out.println("Введите номер поезда (0, чтобы выйти):");

        int num;
        do {

            num = in.nextInt();

            boolean isCorrect = false;
            for(Train x : trains) {
                if(x.getNumber() == num) {
                    x.print();
                    isCorrect = true;
                    break;
                }
            }

            if(!isCorrect) {
                System.out.println("Поезда с таким номером не существует");
            }

        }while(num != 0);
    }
}
