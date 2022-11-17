package it.unibo.io.files;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class UseStreamDumper {
	public static void main(String[] args) throws IOException {
		final byte[] bytes = new byte[]{ 10, 20, 30 };
		// Cerco un file txt nella home folder dell'utente
		final var userHome = new File(System.getProperty("user.home"));
		if (!userHome.isDirectory()) {
			throw new IllegalStateException("The user home is not a directory!");
		}
		final Iterator<File> allFiles = Arrays.asList(userHome.listFiles()).iterator();
		File txt = null;
		while (txt == null && allFiles.hasNext()) {
			final var file = allFiles.next();
			if (file.getName().endsWith(".txt")) {
				txt = file;
			}
		}
		Objects.requireNonNull(txt, "No txt files on the user home directory!");
		try(
			final InputStream input = new ByteArrayInputStream(bytes);
			final InputStream input2 = new FileInputStream(txt);
		) {
			System.out.println("First stream:");
			StreamDumper.dump(input);
			System.out.println("\nSecond stream:");
			StreamDumper.dump(input2);
			System.out.println();
		}
	}
}
