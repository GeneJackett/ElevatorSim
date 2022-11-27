package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class ElevatorSimulator {

    public static void main(String[] args) throws Exception {
        //String fileName = args[0];
        String fileName = "FloorPresses.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        FloorChange elevatorButton = new FloorChange();

        int floorNum = reader.read();
        while (floorNum != -1) {
            switch (floorNum) {
                case '1':
                    elevatorButton.processOne();
                    break;
                case '2':
                    elevatorButton.processTwo();
                    break;
                case '3':
                    elevatorButton.processThree();
                    break;
                case ' ':
                    break;
                default:
                    System.out.println("Floor DNE");
            }
            floorNum = reader.read();
        }
    }

}

