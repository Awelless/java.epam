package com.awelless;

public class Sentence {

    Word[] words;

    Sentence() {
        words = null;
    }

    Sentence(Word ...words) {
        this.words = words;
    }

    Sentence(String ...words) {

        this.words = new Word[words.length];

        for(int i = 0; i < words.length; ++i) {
            this.words[i] = new Word(words[i]);
        }
    }

    @Override
    public String toString() {

        if(words.length == 0) {
            return null;
        }

        StringBuilder sentence = new StringBuilder(words[0].toString());
        sentence.setCharAt(0, Character.toUpperCase(sentence.charAt(0)));

        for(int i = 1; i < words.length; ++i) {
            sentence.append(" " + words[i]);
        }

        sentence.append(".");

        return sentence.toString();
    }

}
