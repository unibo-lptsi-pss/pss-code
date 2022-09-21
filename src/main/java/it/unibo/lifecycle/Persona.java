package it.unibo.lifecycle;

import java.util.Calendar;

public class Persona { // dichiarazione classe
	String nome;
	int annoNascita;
	boolean sposato;

	Persona(String nome) {
		this.nome = nome;
		this.annoNascita = Persona.currentYear;
		this.sposato = false;
	}

	Persona(String nome, int annoNascita) {
		this.nome = nome;
		this.annoNascita = annoNascita;
		this.sposato = false;
	}

	Persona(String nome, int annoNascita, boolean sposato) {
		this.nome = nome;
		this.annoNascita = annoNascita;
		this.sposato = sposato;
	}

	static int currentYear = Calendar.getInstance().get(Calendar.YEAR);
}