package it.unibo.io.files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UseByteArrayStream {
    public static void main(String[] args) throws IOException {
        final byte[] b = new byte[] { 10, 20, -1, 40, -58 };
        final InputStream in = new ByteArrayInputStream(b);
        try {
            int c = in.read();
            while (c != -1) {
                System.out.println(c);
                c = in.read();
            }
            System.out.println("End of stream");
        } finally { // assicura la chiusura anche con eccezioni
            in.close(); // problema: può tirare eccezione!
            // Notare che il main può lanciare IOException, molto scomodo!
        }
    }
}
