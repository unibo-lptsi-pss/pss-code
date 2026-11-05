package it.unibo.advancedmechanisms.enums.en2;

import static it.unibo.advancedmechanisms.enums.en2.Region.*;
import java.io.IO;

import java.util.*;


public class UseRegion {
	public static void main(String[] args) {
		final ArrayList<Region> list = new ArrayList<>();
		// 4 modi di ottenere una Region
		list.add(Region.LOMBARDIA);
		list.add(SARDEGNA);
		list.add(Region.valueOf("SICILIA"));
		list.add(Region.values()[10]);
		
		for (final Region r : list) {
			IO.println("toString "+r); // LOMBARDIA,...,MOLISE
			IO.println("ordinal "+r.ordinal()); // 8, 13, 14, 10
			IO.println("name "+r.name()); // LOMBARDIA,...,MOLISE
			IO.println("---");
		}
		
		for (final Region r : Region.values()) {
			IO.print(r + " "); // Stampa tutte le regioni
		}

	}
}
