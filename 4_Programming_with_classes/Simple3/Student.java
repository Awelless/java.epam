package com.awelless;

import static java.lang.Math.max;

public class Student {

    private String name;
    int group;
    private int[] marks;

    Student() {
        name = "";
        group = 0;
        marks = new int[5];
    }

    Student(String _name, int _group, int[] _marks) {
        name = _name;
        group = _group;
        marks = _marks;
    }

    public boolean isExcellent() {

        for(int x : marks) {
            if(x < 9) {
                return false;
            }
        }

        return true;
    }

    public void print() {
        System.out.print(name);
        System.out.printf(" gr. %06d\n", group);
    }
}
