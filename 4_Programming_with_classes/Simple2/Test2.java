package com.awelless;

import static java.lang.Math.max;

public class Test2 {

    int a, b;

    Test2() {
        a = 0;
        b = 0;
    }

    Test2(int _a, int _b) {
        a = _a;
        b = _b;
    }

    public void setA(int _a) {
        a = _a;
    }

    public void setB(int _b) {
        b = _b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
