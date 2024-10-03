package it.unibo.lifecycle;

import java.util.Calendar;

public class Person { // dichiarazione classe
	String name;
	int birthYear;
	boolean isMarried;

	Person(String nome) {
		this.name = nome;
		this.birthYear = Person.currentYear;
		this.isMarried = false;
	}

	Person(String nome, int annoNascita) {
		this.name = nome;
		this.birthYear = annoNascita;
		this.isMarried = false;
	}

	Person(String nome, int annoNascita, boolean sposato) {
		this.name = nome;
		this.birthYear = annoNascita;
		this.isMarried = sposato;
	}

	static int currentYear = Calendar.getInstance().get(Calendar.YEAR);
}