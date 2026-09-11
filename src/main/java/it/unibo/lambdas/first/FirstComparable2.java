package it.unibo.lambdas.first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.io.IO;

public class FirstComparable2 {
    static void main() {
        final List<Person> list = new ArrayList<>();
        list.add(new Person("Mario", 1960, true));
        list.add(new Person("Gino", 1970, false));
        list.add(new Person("Rino", 1951, true));
        IO.println(list);

        // Sorting with a lambda
        list.sort((p1, p2) -> Integer.compare(p2.getYear(), p1.getYear()));
        IO.println(list);

        // Nota che sort richiede un Comparator<Persona>, che ha il solo metodo:
        // int compare(Persona p1, Persona p2)
        // Quindi il codice equivalente generato da javac è:
        list.sort(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Integer.compare(p2.getYear(), p1.getYear());
            }
        });
        IO.println(list);
    }
}
