package com.awelless;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class Counter {

    private int value, minValue, maxValue;

    Counter() {
        value = 0;
        minValue = -10;
        maxValue = 10;
    }

    Counter(int _minValue, int _maxValue, int _value) {
        value = _value;
        minValue = _minValue;
        maxValue = _maxValue;
    }

    public void increase() {
        ++value;
        value = min(value, maxValue);
    }

    public void decrease() {
        --value;
        value = max(value, minValue);
    }

    public int getValue() {
        return value;
    }
}
