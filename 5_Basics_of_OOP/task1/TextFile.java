package com.awelless;

import java.text.Format;

public class TextFile extends File {

    private StringBuilder contents;

    private TextFile(Directory directory, String name) {
        super(directory, name, "txt");
        this.contents = new StringBuilder();
    }

    static public TextFile create(String directory, String name) {
        return new TextFile(new Directory(directory), name);
    }

    static public TextFile create(Directory directory, String name) {
        return new TextFile(directory, name);
    }

    public void printContents() throws Exception{

        if(contents == null) {
            throw new Exception("Can't print contents. File is deleted");
        }

        System.out.println(contents.toString());
    }

    public void addContents(String contents) {
        this.contents.append(contents);
    }

    @Override
    public void delete() {
        super.delete();
        this.contents = null;
    }
}
