package it.unibo.patterns.strategy.person;

public class KeepPersonIfBornLaterThanYear implements PersonPredicate {
    final int year;

    public KeepPersonIfBornLaterThanYear(final int year) {
        this.year = year;
    }

    public boolean keep(Person p) {
        return p.getYearOfBirth() >= year;
    }
}
