package it.unibo.io.files;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.IO;

public class UseStreamDumper {
    static void main() throws IOException {
        final byte[] bytes = new byte[]{ 10, 20, 30 };
        // Cerco un file txt nella home folder dell'utente
        final var txtFiles = FileUtil.findFilesInHomeDirectoryByExtension("txt");
        if (txtFiles.isEmpty()) {
            throw new IllegalStateException("No txt files on the user home directory!");
        }
        final var file = txtFiles.getFirst();
        try(
            final InputStream memoryInput = new ByteArrayInputStream(bytes);
            final InputStream fileInput = new FileInputStream(file)
        ) {
            IO.println(txtFiles.get(0).getAbsolutePath());
            IO.println("First stream (from memory):");
            StreamDumper.dump(memoryInput);
            IO.println("\nSecond stream (from file " + file.getPath() + ":");
            StreamDumper.dump(fileInput);
            IO.println();
        }
    }
}
