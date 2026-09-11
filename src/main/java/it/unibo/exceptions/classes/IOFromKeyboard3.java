package it.unibo.exceptions.classes;

import java.io.*;
import java.io.IO;

public class IOFromKeyboard3 {
	private static final BufferedReader KBD = new BufferedReader(
			new InputStreamReader(System.in));

	private static int getIntFromKbd() throws IOException {
		return Integer.parseInt(KBD.readLine());
	}

	public static void main(String[] args) throws NumberFormatException {
		while (true) {
			try {
				System.out.print("Inserisci un numero: ");
				final int a = getIntFromKbd();
				IO.println("Hai inserito il num.: " + a);
			} catch (IOException e) {
				IO.println("Errore di I/O: " + e);
			}
		}
	}
}