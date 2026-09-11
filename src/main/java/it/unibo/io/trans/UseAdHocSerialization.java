package it.unibo.io.trans;

import java.io.*;
import java.io.IO;

import it.unibo.io.files.UseFile;

public class UseAdHocSerialization {
	public static void main(String[] args) throws Exception {

		try (final ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(UseFile.FILE_NAME))){
			final APersona p = new APersona("Rossi");
			p.used();
			IO.println(p);
			out.writeObject(p);
		}
		
		IO.println("Ri-carico l'oggetto... ");

		try (final ObjectInputStream in = new ObjectInputStream(
				new FileInputStream(UseFile.FILE_NAME))){
			final APersona q = (APersona) in.readObject();
			IO.println(q);
		}
	}
}
