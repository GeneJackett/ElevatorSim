package org.example;

public class AState implements AABState {

    AABContext aabContext;


    public AState(AABContext aabContext) {
        this.aabContext = aabContext;
    }

    public void processA() {
        aabContext.setCurrentState(aabContext.getAAState());
    }

    public void processB() {
        aabContext.setCurrentState(aabContext.getStartState());
    }

    public void processOther() {
        aabContext.setCurrentState(aabContext.getStartState());
    }
}