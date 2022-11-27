package org.example;

public class FloorOne implements ElevatorState {

    FloorChange floorChange;


    public FloorOne(FloorChange floorChange) {
        this.floorChange = floorChange;
    }

    public void processOne() {
        System.out.println("Nothing Happens");
    }

    public void processTwo() {
        System.out.println("Going up...");
        floorChange.setCurrentState(floorChange.getFloorTwoState());
    }

    public void processThree() {
        System.out.println("Going up...");
        floorChange.setCurrentState(floorChange.getFloorThreeState());
    }

    //process other
}