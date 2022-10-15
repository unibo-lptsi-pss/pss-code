package it.unibo.patterns.strategy;

public class Person {	
	private String name;
	private String surname;
	private int year = 1900;
	
    Person(String name, String surname, int year) {
        super();
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
