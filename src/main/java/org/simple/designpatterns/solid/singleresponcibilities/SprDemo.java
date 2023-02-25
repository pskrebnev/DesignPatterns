package org.simple.designpatterns.solid.singleresponcibilities;

import java.io.IOException;

public class SprDemo {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addEntry("First things");
        journal.addEntry("Second things");
        journal.addEntry("Another row");

        System.out.println(journal);

        Persistence persistence = new Persistence();

        String filename = "src/main/resources/list.txt";
        try {
            persistence.saveToFile(journal, filename, false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        try {
//            Runtime.getRuntime().exec("notepad.exe " + filename);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
