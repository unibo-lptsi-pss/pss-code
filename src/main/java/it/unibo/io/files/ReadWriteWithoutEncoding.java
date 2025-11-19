package it.unibo.io.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWriteWithoutEncoding {

    private static final String FILE_NAME = "test-output.txt";

    static void main() throws IOException {
        try (final var out = new FileOutputStream(FILE_NAME)) {
            System.out.println("Writing...");
            for (int b = 0; b < 1000; b++) {
                System.out.print(b + " ");
                out.write(b);
            }
            System.out.println("Done.");
        }
        try (final var in = new FileInputStream(FILE_NAME)) {
            System.out.println("Reading...");
            for (var read = in.read(); read != -1; read = in.read()) {
                System.out.print(read + " ");
            }
            System.out.println("Done.");
        }
        // Quick method to read the file as a text string
        System.out.println("Actual file content:");
        System.out.println(new String(Files.readAllBytes(Path.of(FILE_NAME))));
    }
}
