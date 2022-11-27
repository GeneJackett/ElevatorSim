package org.example;


public class AABCounter {

    private enum State { START, A, AA };

    private State st = State.START;


    private int count = 0;

    public void nextChar(char c) {
        switch (st) {
            case START:
                if (c == 'A') {
                    st = State.A;
                }
                break;
            case A:
                if (c == 'A') {
                    st = State.AA;
                }
                else {
                    st = State.START;
                }
                break;
            case AA:
                switch (c) {
                    case 'B':
                        count++;
                        st = State.START;
                        break;
                    case 'A':
                        break;
                    default:
                        st = State.START;
                }
                break;
            default:
                throw new RuntimeException("Unexpected state: " + st);
        }
    }

    public int getCount() {
        return count;
    }
}
