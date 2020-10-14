package com.awelless;

import static java.lang.Math.max;

public class Test1 {

    int a, b;

    public void print() {
        System.out.println(a + " " + b);
    }

    public void set(int _a, int _b) {
        a = _a;
        b = _b;
    }

    public int getSum() {
        return a + b;
    }

    public int getMax() {
        return max(a, b);
    }
}
