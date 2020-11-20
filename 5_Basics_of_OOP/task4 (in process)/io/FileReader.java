package com.awelless.io;

import com.awelless.Treasures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    static private String in(String path) throws IOException {

        StringBuilder builder = new StringBuilder();

        try {
            FileInputStream fis = new FileInputStream(path);

            while (fis.available() > 0) {
                builder.append(fis.read());
            }
        }
        catch (IOException e) {
            throw e;
        }

        return builder.toString();
    }

    static public Treasures getTreasures(String filePath) throws IOException {

        try {
            String input = in(filePath);

            

        }
        catch (IOException e) {
            throw e;
        }
    }
}
