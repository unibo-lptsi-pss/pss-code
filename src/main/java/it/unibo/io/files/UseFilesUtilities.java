package it.unibo.io.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.io.IO;

public class UseFilesUtilities {
    public static void main(final String[] args) throws IOException {
        final var bytes = new byte[] { 1, 2, -128, 99 };
        final Path binary = Paths.get("binary-file.dat");
        Files.write(binary, bytes);
        IO.println("Read bytes: " + Arrays.toString(Files.readAllBytes(binary)));
        final List<String> dante = List.of(
            "Tanto gentile e tanto onesta pare",
            "la donna mia, quand'ella altrui saluta",
            "ch'ogne lingua deven tremando muta"
        );
        final Path text = Paths.get("text-file.txt");
        Files.write(text, dante, StandardCharsets.UTF_8); // Always specify the Charset!
        IO.println("Read all file lines:\n" + Files.readAllLines(text, StandardCharsets.UTF_8));
        IO.println("Read the file as string:\n" + Files.readString(text, StandardCharsets.UTF_8));
        Files.writeString(text, "this is\na multiline string!", StandardCharsets.UTF_8);
        IO.println("Read all file lines:\n" + Files.readAllLines(text, StandardCharsets.UTF_8));
        IO.println("Read the file as string:\n" + Files.readString(text, StandardCharsets.UTF_8));
    }
}
