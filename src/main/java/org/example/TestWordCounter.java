package org.example;
    import java.io.BufferedReader;
    import java.io.FileReader;

    public class TestWordCounter {

        public static void main(String[] args) throws Exception {
            //String fileName = args[0];
            String fileName = "wordCount.txt";
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

    }