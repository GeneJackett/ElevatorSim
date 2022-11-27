package org.example;

public class AABContext {

    AABState currentState;

    int count = 0;

    AABState startState;
    AABState aState;
    AABState aaState;



    public AABContext() {
        startState = new StartState(this);
        aState = new AState(this);
        aaState = new AAState(this);
        currentState = startState;
    }

    public void setCurrentState(AABState currentState) {
        this.currentState = currentState;
    }

    public AABState getStartState() {
        return startState;
    }

    public AABState getAState() {
        return aState;
    }

    public AABState getAAState() {
        return aaState;
    }

    public void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void processA() {
        currentState.processA();
    }

    public void processB() {
        currentState.processB();
    }

    public void processOther() {
        currentState.processOther();
    }



}
