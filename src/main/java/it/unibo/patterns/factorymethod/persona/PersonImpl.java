package it.unibo.patterns.factorymethod.persona;

public class PersonImpl implements Person {
	
	private String name;
	private String surname;
	private int year = 1900;
	
    PersonImpl(String name, String surname, int year) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public int getYearOfBirth() {
        return year;
    }
}
