package it.unibo.io.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class UsePrintStream {

    private static final File FILE = new File("test-output.txt");

    private static void dumpFile() throws IOException {
        for (final String line: Files.readAllLines(FILE.toPath(), StandardCharsets.UTF_8)) {
            System.out.println(line);
        }
    }

    static void main() throws IOException {
        try (
            final PrintStream fileOut = new PrintStream(
                new FileOutputStream(FILE),
                false,
                StandardCharsets.UTF_8 // Always specify how to translate text into bytes and viceversa
            )
        ) {
            fileOut.println("Hey, this is my first printed line in a text file!");
            fileOut.println("Here is another text line");
            System.out.println("Writing completed!");
            dumpFile();
        }
    }
}
