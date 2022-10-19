package it.unibo.patterns.strategy;

public class Person {	
	private final String name;
	private final String surname;
	private final int year;
	
    Person(final String name, final String surname, final int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return year;
    }
}
