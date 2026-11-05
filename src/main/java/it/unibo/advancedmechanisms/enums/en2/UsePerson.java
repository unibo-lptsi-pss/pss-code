package it.unibo.advancedmechanisms.enums.en2;

import java.util.*;
import java.io.IO;

public class UsePerson {
	public static void main(String[] args) {
		final ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("Mario","Rossi",Region.EMILIA_ROMAGNA));
		list.add(new Person("Gino","Bianchi",Region.SICILIA));
		list.add(new Person("Carlo","Verdi",Region.LOMBARDIA));
		final List<Person> out = 
		    Person.fromRegion(list,Region.EMILIA_ROMAGNA); 
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
