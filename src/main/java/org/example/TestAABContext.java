package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestAABContext {

    public static void main(String[] args) throws Exception {
        //String fileName = args[0];
        String fileName = "AABCount.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        AABContext aab = new AABContext();

        int c = reader.read();
        while (c != -1) {
            switch (c) {
                case 'A':
                    aab.processA();
                    break;
                case 'B':
                    aab.processB();
                    break;
                default:
                    aab.processOther();
            }
            c = reader.read();
        }

        System.out.println("File " + fileName +" contains "
                + aab.getCount() + " AAB sequences");

    }

}

