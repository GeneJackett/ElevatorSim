package org.example;

public class AAState implements AABState{

    AABContext aabContext;


    public AAState(AABContext aabContext) {
        this.aabContext = aabContext;
    }

    public void processA() {
    }

    public void processB() {
        aabContext.incrementCount();
        aabContext.setCurrentState(aabContext.getStartState());
    }

    public void processOther() {
        aabContext.setCurrentState(aabContext.getStartState());
    }
}

