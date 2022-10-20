package it.unibo.patterns.strategy.person;

public class PersonComparatorByAge implements PersonCompareStrategy {
    public int compareTwoPeople(Person p1, Person p2) {
        return p1.getYearOfBirth() < p2.getYearOfBirth() ? -1 :
            (p1.getYearOfBirth() == p2.getYearOfBirth() ? 0 : +1);
    }	
}
