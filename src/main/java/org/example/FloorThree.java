package org.example;

public class FloorThree implements ElevatorState {

    FloorChange floorChange;


    public FloorThree(FloorChange floorChange) {
        this.floorChange = floorChange;
    }

    public void processOne() {
        System.out.println("Going down...");
        floorChange.setCurrentState(floorChange.getFloorOneState());
    }

    public void processTwo() {
        System.out.println("Going down...");
        floorChange.setCurrentState(floorChange.getFloorTwoState());
    }

    public void processThree() {
        System.out.println("Nothing Happens");
    }
}
