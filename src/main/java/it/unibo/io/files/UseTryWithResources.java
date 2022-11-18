package it.unibo.io.files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UseTryWithResources {
    public static void main(String[] args) throws IOException {
        final byte[] b = new byte[] { 10, 20, 30, 40, 50 };
        try (final InputStream in = new ByteArrayInputStream(b)) {
            int c = in.read();
            while (c != -1) { // C-style
                System.out.println(c);
                c = in.read();
            }
            System.out.println("End of stream");
        }
    }
}
