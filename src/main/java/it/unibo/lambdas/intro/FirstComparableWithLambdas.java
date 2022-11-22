package it.unibo.lambdas.intro;

import java.util.*;

public class FirstComparableWithLambdas {
	public static void main(String[] args) {
		final List<Person> list = new ArrayList<Person>();
		list.add(new Person("Mario", 1960, true));
		list.add(new Person("Gino", 1970, false));
		list.add(new Person("Rino", 1951, true));
		System.out.println(list);

		Collections.sort(list, 
			(Person o1, Person o2) -> Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth()));
		System.out.println(list);

		Collections.sort(list, 
			(o1, o2) -> { return Integer.compare(o2.getYearOfBirth(), o1.getYearOfBirth()); } );
		System.out.println(list);

		Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println(list);
	}
}