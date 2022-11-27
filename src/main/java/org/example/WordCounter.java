package org.example;


    public class WordCounter {

        private boolean lookingForSpace = false;

        private int count = 0;

        public void nextChar(char c) {
            if (lookingForSpace) {
                if (Character.isWhitespace(c)) {
                    lookingForSpace = false;
                }
            }
            else {
                if (!Character.isWhitespace(c)) {
                    lookingForSpace = true;
                    count++;
                }
            }
        }

        public int getCount() {
            return count;
        }
    }

