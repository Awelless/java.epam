package com.awelless;

import java.util.Comparator;

import static java.lang.Math.max;
import java.util.Arrays;

public class Voucher {

    private VoucherType voucherType;
    private TransportType transportType;
    private Meal[] meals;
    private int days;

    Voucher(VoucherType voucherType, TransportType transportType,
            int days, Meal ...meals) {
        this.voucherType = voucherType;
        this.transportType = transportType;
        this.days = days;
        this.meals = meals;
        Arrays.sort(meals);
    }

    public int getDays() {
        return days;
    }

    public VoucherType getVoucherType() {
        return voucherType;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public Meal[] getMeals() {
        return meals;
    }

    @Override
    public String toString() {

        String voucherType = null;
        switch (this.voucherType) {

            case RELAXATION: voucherType = "отдых";     break;
            case EXCURSION:  voucherType = "экскурсия"; break;
            case TREATMENT:  voucherType = "лечение";   break;
            case SHOPPING:   voucherType = "шоппинг";   break;
            case CRUISE:     voucherType = "круиз";     break;

            default: break;
        }

        String transportType = null;
        switch (this.transportType) {

            case BUS:   transportType = "автобус"; break;
            case TRAIN: transportType = "поезд";   break;
            case PLANE: transportType = "самолет"; break;

            default: break;
        }

        StringBuilder meals = new StringBuilder();
        for(Meal meal : this.meals) {
            switch (meal) {

                case BREAKFAST: meals.append("завтрак" + " "); break;
                case LUNCH:     meals.append("обед" + " ");    break;
                case DINNER:    meals.append("ужин" + " ");    break;

                default: break;
            }
        }
        
        return new String(
        "Тип путевки: " + voucherType + "\n" +
               "Тип транспорта: " + transportType + "\n" +
               "Всего дней: " + days + "\n" +
               "Питание: " + meals.toString() + "\n"
        );

    }
}

class CompareByDays implements Comparator<Voucher> {

    @Override
    public int compare(Voucher a, Voucher b) {
        return a.getDays() - b.getDays();
    }
}

class CompareByVoucherType implements Comparator<Voucher> {

    @Override
    public int compare(Voucher a, Voucher b) {
        return a.getVoucherType().getCode() - b.getVoucherType().getCode();
    }
}

class CompareByTransportType implements Comparator<Voucher> {

    @Override
    public int compare(Voucher a, Voucher b) {
        return a.getTransportType().getCode() - b.getTransportType().getCode();
    }
}

class CompareByMeals implements Comparator<Voucher> {

    @Override
    public int compare(Voucher a, Voucher b) {

        Meal[] meals1 = a.getMeals();
        Meal[] meals2 = b.getMeals();

        for (int i = 0; i < max(meals1.length, meals2.length); ++i) {

            if (meals1.length <= i) {
                return -1;
            }

            if (meals2.length <= i) {
                return 1;
            }

            if (meals1[i] != meals2[i]) {
                return meals1[i].getCode() - meals2[i].getCode();
            }
        }

        return 0;
    }
}

enum VoucherType {
    RELAXATION(0),
    EXCURSION(1),
    TREATMENT(2),
    SHOPPING(3),
    CRUISE(4);

    private int code;
    VoucherType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

enum TransportType {
    BUS(0),
    TRAIN(1),
    PLANE(2);

    private int code;
    TransportType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

enum Meal {
    BREAKFAST(0),
    LUNCH(1),
    DINNER(2);

    private int code;
    Meal(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
