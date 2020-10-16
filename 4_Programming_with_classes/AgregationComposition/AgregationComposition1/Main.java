package com.awelless;

public class Main {

    public static void main(String[] args) {

        Sentence s1 = new Sentence(
                "i", "learn", "java"
        );

        Sentence s2 = new Sentence(
                new Word("or"), new Word("maybe"), new Word("ruby")
        );

        Sentence s3 = new Sentence(
                "i", "don't", "know"
        );

        Text text = new Text("Leaning programming", s1, s2, s3);

        text.printText();

        Sentence s4 = new Sentence(
                "now", "i", "learn", "java"
        );

        text.addSentences(s4);
        text.printText();
    }
}
