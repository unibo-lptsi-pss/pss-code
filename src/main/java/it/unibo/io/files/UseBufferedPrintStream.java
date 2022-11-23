package it.unibo.io.files;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class UseBufferedPrintStream {

    private static final File FILE = new File("test-output.txt");

    public static void main(String[] args) throws IOException {
        // string -> buffer ->  compress -> file
        try (final PrintStream fileOut = new PrintStream(
            new BufferedOutputStream(new FileOutputStream(FILE)), // better performance
            false,
            StandardCharsets.UTF_8 // Always specify how to translate text into bytes and viceversa
        )) {
            fileOut.println("Hey, this is my first printed line in a text file!");
            fileOut.println("Here is another text line");
        }
        System.out.println("Writing completed!");
        // To read, we must reverse the operations:
        // file -> decompress -> string (optionally, with a buffer)
        try (
            final var inputReader = new BufferedReader(
                new InputStreamReader(new FileInputStream(FILE), StandardCharsets.UTF_8)
            )
        ) {
            for (String line = inputReader.readLine(); line != null; line = inputReader.readLine()) {
                System.out.println("Read line: " + line);
            }
        }
    }
}
