package org.example;

public class FloorTwo implements ElevatorState {

    FloorChange floorChange;


    public FloorTwo(FloorChange floorChange) {
        this.floorChange = floorChange;
    }

    public void processOne() {
        System.out.println("Going down...");
        floorChange.setCurrentState(floorChange.getFloorOneState());
    }

    public void processTwo() {
        System.out.println("Nothing Happens");
    }

    public void processThree() {
        System.out.println("Going up...");
        floorChange.setCurrentState(floorChange.getFloorThreeState());
    }
}
