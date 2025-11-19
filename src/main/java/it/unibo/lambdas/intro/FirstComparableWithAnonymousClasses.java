package it.unibo.lambdas.intro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirstComparableWithAnonymousClasses {
    static void main() {
        final List<Person> list = new ArrayList<>();
        list.add(new Person("Mario", 1960, true));
        list.add(new Person("Gino", 1970, false));
        list.add(new Person("Rino", 1951, true));
        System.out.println(list);
        final Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth());
            }
        };
        list.sort(ageComparator);
        System.out.println(list);
        list.sort(ageComparator.reversed());
        System.out.println(list);
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(list);
    }
}