package com.awelless;

import com.awelless.io.FileReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Treasures treasures;

        try {
            treasures = FileReader.getTreasures("treasures.txt");
        }
        catch (IOException e) {
            System.out.println(e.getStackTrace());
        }



    }
}
