package it.unibo.patterns.factorymethod;

public interface PersonFactory {
    Person createBasic(String name, String surname);

    Person createAdvanced(String name, String surname, int yearOfBirth);
}