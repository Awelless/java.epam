package com.awelless;

public class File {

    private Directory directory;
    private String name, format;

    public File() {
        this.directory = null;
        this.name      = null;
        this.format    = null;
    }

    public File(Directory directory, String name, String format) {
        this.directory = directory;
        this.name      = name;
        this.format    = format;
    }

    static public File create(String directory, String name, String format) {
        return new File(new Directory(directory), name, format);
    }

    static public File create(Directory directory, String name, String format) {
        return new File(directory, name, format);
    }

    public void rename(String newName) {
        name = newName;
    }

    public void delete() {
        this.name   = null;
        this.format = null;
    }

    @Override
    public String toString() {
        return new String(directory.toString() + "\\" + name + "." + format);
    }
}
