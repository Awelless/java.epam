package com.awelless;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Voucher voucher1 = new Voucher(
                VoucherType.RELAXATION, TransportType.BUS, 5, Meal.BREAKFAST, Meal.DINNER
        );

        Voucher voucher2 = new Voucher(
                VoucherType.CRUISE, TransportType.PLANE, 8, Meal.LUNCH
        );

        Voucher voucher3 = new Voucher(
                VoucherType.SHOPPING, TransportType.TRAIN, 2
        );

        Voucher voucher4 = new Voucher(
                VoucherType.TREATMENT, TransportType.TRAIN, 11, Meal.BREAKFAST, Meal.LUNCH, Meal.DINNER
        );

        Vouchers vouchers = new Vouchers(
                voucher1, voucher2, voucher3, voucher4
        );

        ArrayList<Voucher> cur;

        cur = vouchers.getBy(5);
        for(Voucher voucher : cur) {
            System.out.println(voucher);
        }
        System.out.println("----------------");

        cur = vouchers.getBy(VoucherType.SHOPPING);
        for(Voucher voucher : cur) {
            System.out.println(voucher);
        }
        System.out.println("----------------");

        cur = vouchers.getBy(TransportType.TRAIN);
        for(Voucher voucher : cur) {
            System.out.println(voucher);
        }
        System.out.println("----------------");

        cur = vouchers.getBy(Meal.BREAKFAST, Meal.LUNCH);
        for(Voucher voucher : cur) {
            System.out.println(voucher);
        }
        System.out.println("----------------");



    }
}
