package org.example;

public class StartState implements AABState {

    AABContext aabContext;


    public StartState(AABContext aabContext) {
        this.aabContext = aabContext;
    }

    public void processA() {
        aabContext.setCurrentState(aabContext.getAState());
    }

    public void processB() {
    }

    public void processOther() {
    }
}


