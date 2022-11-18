package it.unibo.io.files;

import java.io.IOException;
import java.io.InputStream;

public class StreamDumper {
    // rendo inaccessibile il costruttore
    private StreamDumper() {}

    public static void dump(final InputStream input) throws IOException {
        for (int value = input.read(); value != -1; value = input.read()) {
            System.out.print(value + "\t");
        }
    }
}
