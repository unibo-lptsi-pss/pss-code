package it.unibo.patterns.strategy.person;

public class PersonComparatorByFullName implements PersonCompareStrategy {
    public int compareTwoPeople(Person p1, Person p2) {
        String fullName1 = p1.getSurname() + p1.getName();
        String fullName2 = p2.getSurname() + p2.getName();
        return fullName1.compareTo(fullName2); // reuse compareTo on String
    }	
}
