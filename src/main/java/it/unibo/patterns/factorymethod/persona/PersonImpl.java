package it.unibo.patterns.factorymethod.persona;

public class PersonImpl implements Person {
	private final String name;
	private final String surname;
	private final int year;
	
    PersonImpl(final String name, final String surname, final int year) {
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
