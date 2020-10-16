package com.awelless;

import java.util.ArrayList;

public class Vouchers {

    ArrayList<Voucher> vouchers;

    Vouchers() {
        vouchers = new ArrayList<Voucher>();
    }

    Vouchers(Voucher  ...vouchers) {

        this.vouchers = new ArrayList<Voucher>();
        for(Voucher voucher : vouchers) {
            this.vouchers.add(voucher);
        }
    }

    public ArrayList<Voucher> getSortedByVoucherType() {
        vouchers.sort(new CompareByVoucherType());
        return new ArrayList<Voucher>(vouchers);
    }

    public ArrayList<Voucher> getSortedByTransportType() {
        vouchers.sort(new CompareByTransportType());
        return new ArrayList<Voucher>(vouchers);
    }

    public ArrayList<Voucher> getSortedByDays() {
        vouchers.sort(new CompareByDays());
        return new ArrayList<Voucher>(vouchers);
    }

    public ArrayList<Voucher> getSortedByMeals() {
        vouchers.sort(new CompareByMeals());
        return new ArrayList<Voucher>(vouchers);
    }

    public ArrayList<Voucher> getBy(VoucherType voucherType) {

        ArrayList<Voucher> out = new ArrayList<Voucher>();
        for (Voucher voucher : vouchers) {
            if (voucher.getVoucherType() == voucherType) {
                out.add(voucher);
            }
        }

        return out;
    }

    public ArrayList<Voucher> getBy(TransportType transportType) {

        ArrayList<Voucher> out = new ArrayList<Voucher>();
        for (Voucher voucher : vouchers) {
            if (voucher.getTransportType() == transportType) {
                out.add(voucher);
            }
        }

        return out;
    }

    public ArrayList<Voucher> getBy(int days) {

        ArrayList<Voucher> out = new ArrayList<Voucher>();
        for (Voucher voucher : vouchers) {
            if (voucher.getDays() == days) {
                out.add(voucher);
            }
        }

        return out;
    }

    public ArrayList<Voucher> getBy(Meal ...meals) {

        ArrayList<Voucher> out = new ArrayList<Voucher>();
        for (Voucher voucher : vouchers) {

            Meal[] curMeals = voucher.getMeals();

            int mealsPtr = 0;
            for (Meal meal : curMeals) {

                if (mealsPtr == meals.length) {
                    break;
                }

                if (meal == meals[mealsPtr]) {
                    ++mealsPtr;
                }
            }

            if (mealsPtr == meals.length) {
                out.add(voucher);
            }
        }

        return out;
    }
}
