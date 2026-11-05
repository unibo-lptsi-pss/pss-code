package it.unibo.advancedmechanisms.enums.en2;

import java.util.*;

public class Person {
	private final String name;
	private final String surname;
	private final Region region;
	
	public Person(String name, String surname, Region region) {
		this.name = name;
		this.surname = surname;
		this.region = region;
	}
	
	public boolean isIslander() {
		// Confronto veloce!!
		return (this.region == Region.SARDEGNA 
				|| this.region == Region.SICILIA);
	}

	public static List<Person> fromRegion(Collection<Person> coll, 
			Region region) {
		final List<Person> list = new ArrayList<>();
		for (final Person person : coll) {
			if (person.region == region) { // Nota l'== !!
				list.add(person);
			}
		}
		return list;
	}
	
	public String toString() {
		return "[" + name + "," + surname + ","	+ region + "]";
	}
}
