package it.unibo.lambdas.first;

import java.util.*;

public class FirstComparable2 {
	public static void main(String[] args) {
		final List<Person> list = new ArrayList<Person>();
		list.add(new Person("Mario", 1960, true));
		list.add(new Person("Gino", 1970, false));
		list.add(new Person("Rino", 1951, true));
		System.out.println(list);

		// Sorting with a lambda
		Collections.sort(list, (p1, p2) -> Integer.compare(p2.getYear(), p1.getYear()));
		System.out.println(list);

		// Nota che sort richiede un Comparator<Persona>, che ha il solo metodo:
		// int compare(Persona p1, Persona p2)
		// Quindi il codice equivalente generato da javac è:
		Collections.sort(list, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return Integer.compare(p2.getYear(), p1.getYear());
			}
		});
		System.out.println(list);
	}
}
