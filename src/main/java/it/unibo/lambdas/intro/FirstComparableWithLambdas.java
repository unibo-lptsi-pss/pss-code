package it.unibo.lambdas.intro;

import java.util.ArrayList;
import java.util.List;

public class FirstComparableWithLambdas {
    static void main() {
        final List<Person> list = new ArrayList<>();
        list.add(new Person("Mario", 1960, true));
        list.add(new Person("Gino", 1970, false));
        list.add(new Person("Rino", 1951, true));
        System.out.println(list);

        list.sort((Person o1, Person o2) -> Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth()));
        System.out.println(list);

        list.sort((o1, o2) -> Integer.compare(o2.getYearOfBirth(), o1.getYearOfBirth()));
        System.out.println(list);

        list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(list);
    }
}
