package it.unibo.lifecycle;
import java.io.IO;

public class UsePerson {
	public static void main(String[] s) {
		// Person p1 = new Person(); NO!!
		Person p2 = new Person("Mario Rossi");
		Person p3 = new Person("Gino Bianchi", 1979);
		Person p4 = new Person("Carlo Verdi", 1971, true);

		Person[] persone = new Person[]{ p2, p3, p4 };
		for(int i=0; i < persone.length; i++){
			IO.println(persone[i].name + ", nato/a nel " + persone[i].birthYear + 
				(persone[i].isMarried ? "" : ", non") + " è sposato/a.");
		}
	}
}