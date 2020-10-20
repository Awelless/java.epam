package com.awelless;

import java.util.StringJoiner;

public class Directory {

    private Directory ancestor;
    private String curFolder;

    Directory() {
        ancestor  = null;
        curFolder = null;
    }

    Directory(String directory) {

        if(directory == null || directory.length() == 0) {
            ancestor  = null;
            curFolder = null;
            return;
        }

        String[] words = directory.split("\\\\");

        if(words.length == 1) {
            ancestor  = null;
            curFolder = words[0];
            return;
        }

        StringJoiner joiner = new StringJoiner("\\");
        for(int i = 0; i < words.length - 1; ++i) {
            joiner.add(words[i]);
        }

        this.ancestor  = new Directory(joiner.toString());
        this.curFolder = words[words.length - 1];
    }

    Directory(Directory ancestor, String curFolder) {
        this.ancestor  = ancestor;
        this.curFolder = curFolder;
    }

    @Override
    public String toString() {
        if(ancestor == null) {
            return curFolder;
        }
        return new String(ancestor.toString() + "\\" + curFolder);
    }
}
