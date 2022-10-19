package it.unibo.patterns.factorymethod.persona;

public class PersonImpl implements Person {
	private String name;
	private String surname;
	private int year = 1900;
	
    PersonImpl(String name, String surname, int year) {
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
