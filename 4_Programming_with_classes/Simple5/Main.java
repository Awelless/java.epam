package com.awelless;

public class Main {

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        System.out.println(counter1.getValue());

        for(int i = 0; i < 3; ++i) {
            counter1.increase();
        }
        System.out.println(counter1.getValue());

        for(int i = 0; i < 20; ++i) {
            counter1.decrease();
        }
        System.out.println(counter1.getValue());

        Counter counter2 = new Counter(0, 15, 14);
        System.out.println(counter2.getValue());

        for(int i = 0; i < 3; ++i) {
            counter2.increase();
        }
        System.out.println(counter2.getValue());

        for(int i = 0; i < 10; ++i) {
            counter2.decrease();
        }
        System.out.println(counter2.getValue());
    }
}
