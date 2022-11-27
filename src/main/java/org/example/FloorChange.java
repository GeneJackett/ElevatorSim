package org.example;

public class FloorChange {

    ElevatorState currentState;

    ElevatorState floorOne;
    ElevatorState floorTwo;
    ElevatorState floorThree;

    public FloorChange() {
        floorOne = new FloorOne(this);
        floorTwo = new FloorTwo(this);
        floorThree = new FloorThree(this);
        currentState = floorOne;
    }

    public void setCurrentState(ElevatorState currentState) {
        this.currentState = currentState;
    }

    public ElevatorState getFloorOneState() {
        System.out.println("*ding* The elevator arrives at Floor 1\n" +
                "Doors are open");
        return floorOne;
    }

    public ElevatorState getFloorTwoState() {
        System.out.println("*ding* The elevator arrives at Floor 2\n" +
                "Doors are open");
        return floorTwo;
    }
    public ElevatorState getFloorThreeState() {
        System.out.println("*ding* The elevator arrives at Floor 3\n" +
                "Doors are open");
        return floorThree;
    }

    public void processOne() {
        System.out.println("1 pressed");
        System.out.println("Doors are closed");
        currentState.processOne();
    }

    public void processTwo() {
        System.out.println("2 pressed");
        System.out.println("Doors are closed");
        currentState.processTwo();
    }

    public void processThree() {
        System.out.println("3 pressed");
        System.out.println("Doors are closed");
        currentState.processThree();
    }
}
