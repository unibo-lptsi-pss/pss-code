package it.unibo.advancedmechanisms.enums.en;

import java.util.*;

public class Person {
	private final String name;
	private final String surname;
	private final String region;

	public Person(String name, String surname, String region) {
		this.name = name;
		this.surname = surname;
		this.region = region;
	}

	public String toString() {
		return "[" + name + "," + surname + "," + region + "]";
	}

	public boolean isIslander() { // Confronto molto lento!!
		return (this.region.equals("Sardegna") || 
				this.region.equals("Sicilia"));
	}

	public static List<Person> fromRegion(
			final Collection<Person> coll, 
			final String region
	) { // nota questa possibile formattazione 
		final List<Person> list = new ArrayList<>();
		for (final Person person : coll) {
			if (person.region.equals(region)) { // Confronto lento!!
				list.add(person);
			}
		}
		return list;
	}
}
