package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestAABCounter {

    public static void main(String[] args) throws Exception {
        //String fileName = args[0];
        String fileName = "AABCount.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        AABCounter counter = new AABCounter();

        int c = reader.read();
        while (c != -1) {
            counter.nextChar((char) c);
            c = reader.read();
        }

        System.out.println("File " + fileName +" contains "
                + counter.getCount() + " AAB sequences");

    }

}