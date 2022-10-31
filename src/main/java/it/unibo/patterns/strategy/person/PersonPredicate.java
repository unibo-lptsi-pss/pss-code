package it.unibo.patterns.strategy.person;

public interface PersonPredicate {
    boolean keep(Person p);
}
