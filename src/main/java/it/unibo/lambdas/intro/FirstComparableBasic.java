package it.unibo.lambdas.intro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirstComparableBasic {
    static void main() {
        final List<Person> list = new ArrayList<>();
        list.add(new Person("Mario", 1960, true));
        list.add(new Person("Gino", 1970, false));
        list.add(new Person("Rino", 1951, true));
        System.out.println(list);
        list.sort(new AgeComparator());
        System.out.println(list);
        list.sort(new AgeComparator().reversed());
        System.out.println(list);
        list.sort(new NameComparator());
        System.out.println(list);
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth());
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}