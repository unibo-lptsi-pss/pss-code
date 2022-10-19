package it.unibo.patterns.factorymethod.persona;

public class PersonFactoryImpl implements PersonFactory {
    public Person createBasic(String name, String surname) {
        return new PersonImpl(name, surname, java.time.LocalDate.now().getYear());
    }
    
    public Person createAdvanced(String name, String surname, int yearOfBirth) {
        return new PersonImpl(name, surname, yearOfBirth);
    }
}
