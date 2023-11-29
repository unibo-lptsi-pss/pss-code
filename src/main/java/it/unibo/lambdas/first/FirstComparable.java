package it.unibo.lambdas.first;

import java.util.*;

public class FirstComparable {
	public static void main(String[] args) {
		final List<Person> list = new ArrayList<Person>();
		list.add(new Person("Mario",1960,true));
		list.add(new Person("Gino",1970,false));
		list.add(new Person("Rino",1951,true));
		System.out.println(list);
		
		// Without lambdas
		Collections.sort(list, new Comparator<Person>(){
			public int compare(Person o1, Person o2) {
				return o1.getYear() - o2.getYear();
			}
		});
		System.out.println(list);
		
		// With lambdas
		Collections.sort(list, (o1,o2) -> o2.getYear() - o1.getYear());
		System.out.println(list);
	}
}
