package com.awelless;

import java.util.ArrayList;

public class Text {

    String header;
    ArrayList<Sentence> sentences;

    Text() {
        header = null;
        sentences = null;
    }

    Text(Sentence ...sentences) {

        header = null;
        this.sentences = new ArrayList<Sentence>();

        for(Sentence sentence : sentences) {
            this.sentences.add(sentence);
        }
    }

    Text(String header, Sentence ...sentences) {

        this.header = header;
        this.sentences = new ArrayList<Sentence>();

        for(Sentence sentence : sentences) {
            this.sentences.add(sentence);
        }
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void addSentences(Sentence ...sentences) {

        for(Sentence sentence : sentences) {
            this.sentences.add(sentence);
        }
    }

    public void printText() {

        for(Sentence sentence : sentences) {
            System.out.print(sentence + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {

        StringBuilder text = new StringBuilder();

        for(Sentence sentence : sentences) {
            text.append(sentence + " ");
        }

        return text.toString();
    }


}