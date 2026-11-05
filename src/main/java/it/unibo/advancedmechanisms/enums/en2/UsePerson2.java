package it.unibo.advancedmechanisms.enums.en2;

import static it.unibo.advancedmechanisms.enums.en2.Region.*;
import java.io.IO;

import java.util.*;

public class UsePerson2 {
	public static void main(String[] args) {
		final ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("Mario", "Rossi", EMILIA_ROMAGNA));
		list.add(new Person("Gino", "Bianchi", SICILIA));
		list.add(new Person("Carlo", "Verdi", LOMBARDIA));
		final List<Person> out = Person.fromRegion(list, EMILIA_ROMAGNA); 
		IO.println(list);
		// [[Mario,Rossi,EMILIA_ROMAGNA], [Gino,Bianchi,SICILIA], 
		// [Carlo,Verdi,LOMBARDIA]]
		IO.println(out);
		// [[Mario,Rossi,EMILIA_ROMAGNA]]
		for (final Person p : list) {
			if (p.isIslander()) {
				IO.println(p);
			}
		}
		// [Gino,Bianchi,SICILIA]
	}
}
