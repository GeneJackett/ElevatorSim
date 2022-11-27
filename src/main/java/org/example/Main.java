package org.example;

import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) throws  Exception{String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        WordCounter counter = new WordCounter();

        int c = reader.read();
        while (c != -1) {
            counter.nextChar((char) c);
            c = reader.read();
        }

        System.out.println("File " + fileName +" contains "
                + counter.getCount() + " words");
    }


//    public class TestWordCounter {
//
//        public static void main(String[] args) throws Exception {
//            String fileName = args[0];
//            BufferedReader reader = new BufferedReader(new FileReader(fileName));
//
//            WordCounter counter = new WordCounter();
//
//            int c = reader.read();
//            while (c != -1) {
//                counter.nextChar((char) c);
//                c = reader.read();
//            }
//
//            System.out.println("File " + fileName +" contains "
//                    + counter.getCount() + " words");
//
//        }
//
//    }

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


//    import java.io.BufferedReader;
//import java.io.FileReader;
//
//    public class TestAABCounter {
//
//        public static void main(String[] args) throws Exception {
//            String fileName = args[0];
//            BufferedReader reader = new BufferedReader(new FileReader(fileName));
//
//            AABCounter counter = new AABCounter();
//
//            int c = reader.read();
//            while (c != -1) {
//                counter.nextChar((char) c);
//                c = reader.read();
//            }
//
//            System.out.println("File " + fileName +" contains "
//                    + counter.getCount() + " AAB sequences");
//
//        }
//
//    }

//    import java.io.BufferedReader;
//    import java.io.FileReader;
//
//    public class TestAABContext {
//
//        public static void main(String[] args) throws Exception {
//            String fileName = args[0];
//            BufferedReader reader = new BufferedReader(new FileReader(fileName));
//
//            AABContext aab = new AABContext();
//
//            int c = reader.read();
//            while (c != -1) {
//                switch (c) {
//                    case 'A':
//                        aab.processA();
//                        break;
//                    case 'B':
//                        aab.processB();
//                        break;
//                    default:
//                        aab.processOther();
//                }
//                c = reader.read();
//            }
//
//            System.out.println("File " + fileName +" contains "
//                    + aab.getCount() + " AAB sequences");
//
//        }
//
//    }

   

    }
