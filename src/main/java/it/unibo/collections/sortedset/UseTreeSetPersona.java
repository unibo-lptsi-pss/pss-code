package it.unibo.collections.sortedset;

import java.util.*;
import java.io.IO;

public class UseTreeSetPersona {
	public static void main(String[] s) {
		final List<Integer> l = Arrays.asList(new Integer[] { 10, 20, 30, 40 });
		// TreeSet è un dettaglio, lavorare sempre sull'interfaccia

		final NavigableSet<Persona> set = new TreeSet<>();
		set.add(new Persona("Rossi", 1960, false));
		set.add(new Persona("Bianchi", 1980, true));
		set.add(new Persona("Verdi", 1972, false));
		set.add(new Persona("Neri", 1972, false));
		set.add(new Persona("Neri", 1968, false));

		// Iterazione in ordine, poi al contrario, poi fino al 1970
		for (final Persona p : set) {
			IO.println("Itero: " + p + " hash = " + p.hashCode());
		}
		for (final Persona p : set.descendingSet()) {
			IO.println("Itero al contrario: " + p);
		}
		final Persona limit = new Persona("", 1970, false);
		for (final Persona p : set.headSet(limit, false)) {
			IO.println("Itero fino al 1970: " + p);
		}
	}
}
