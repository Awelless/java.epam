package com.awelless;

public class Word {

    String word;

    Word() {
        word = null;
    }

    Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }

}
