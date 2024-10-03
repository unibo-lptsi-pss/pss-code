package it.unibo.lifecycle;

import java.util.Calendar;

class Person2 { // dichiarazione classe
	String name;
	int birthYear;
	boolean isMarried;
	
	Person2(String nome, int yearOfBirth, boolean isMarried) { // costruttore completo
		this.name = nome;
		this.birthYear = yearOfBirth;
		this.isMarried = isMarried;
	}

	Person2(String name, int birthYear) { // richiama costruttore a 3 arg..
		this(name, birthYear, false);
	}
	
	Person2(String name) {
		this(name, Person2.CURRENT_YEAR); // richiama costruttore a 2 arg..
	}

	static int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
}