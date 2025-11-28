package it.unibo.io.files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UseByteArrayStreamAutoClose {
    static void main() {
        final byte[] b = new byte[] { 10, 20, -1, 40, -58 };
        try (final InputStream in = new ByteArrayInputStream(b)) {
            int c = in.read();
            while (c != -1) {
                System.out.println(c);
                c = in.read();
            }
            System.out.println("End of stream");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
