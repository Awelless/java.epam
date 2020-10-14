package com.awelless;

public class MyTime {

    private int h, m, s;

    MyTime() {
        h = 0;
        m = 0;
        s = 0;
    }

    MyTime(int hours, int minutes, int seconds) {
        h = hours;
        m = minutes;
        s = seconds;
    }

    public void setHours(int hours) {
        h = (hours >= 0 && hours < 24) ? hours : 0;
    }

    public void setMinutes(int minutes) {
        m = (minutes >= 0 && minutes < 60) ? minutes : 0;
    }

    public void setSeconds(int seconds) {
        s = (seconds >= 0 && seconds < 60) ? seconds : 0;
    }

    public void setTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void changeHours(int hours) {
        h = (h + hours + 24) % 24;
    }

    public void changeMinutes(int minutes) {
        m = m + minutes;

        if(m > 0) {
            int hours = m / 60;
            changeHours(hours);
            m %= 60;
        }
        else {
            int hours = (-m + 59) / 60;
            changeHours(-hours);
            m += hours * 60;
        }
    }

    public void changeSeconds(int seconds) {
        s = s + seconds;

        if(s > 0) {
            int minutes = s / 60;
            changeMinutes(minutes);
            s %= 60;
        }
        else {
            int minutes = (-s + 59) / 60;
            changeMinutes(-minutes);
            s += minutes * 60;
        }
    }

    public void changeTime(int hours, int minutes, int seconds) {
        changeHours(hours);
        changeMinutes(minutes);
        changeSeconds(seconds);
    }

    public void print() {
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }
}
