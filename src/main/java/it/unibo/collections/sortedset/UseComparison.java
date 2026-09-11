package it.unibo.collections.sortedset;

import java.util.*;
import java.io.IO;

public class UseComparison {
	public static void main(String[] s) {

		IO.println("abc vs def: " + "abc".compareTo("def")); // neg
		IO.println("1 vs 2: " + Integer.valueOf(1).compareTo(2));// neg

		final Persona p1 = new Persona("Rossi", 1960, false);
		final Persona p2 = new Persona("Rossi", 1972, false);
		final Persona p3 = new Persona("Bianchi", 1972, false);
		final Persona p4 = new Persona("Bianchi", 1972, true);

		IO.println(p1 + " vs " + p2 + ": " + p1.compareTo(p2)); // pos
		IO.println(p2 + " vs " + p3 + ": " + p2.compareTo(p3)); // pos
		IO.println(p3 + " vs " + p4 + ": " + p3.compareTo(p4)); // zero

		IO.println(new TreeSet<Integer>(Arrays.asList(4, 3, 2, 1))); // 1,2,3,4
	}
}
