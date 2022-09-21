package it.unibo.lifecycle;

import java.util.Calendar;

class Persona2 { // dichiarazione classe
	String nome;
	int annoNascita;
	boolean sposato;
	
	Persona2(String nome, int annoNascita, boolean sposato) { // costruttore completo
		this.nome = nome;
		this.annoNascita = annoNascita;
		this.sposato = sposato;
	}

	Persona2(String nome, int annoNascita) { // richiama costruttore a 3 arg..
		this(nome, annoNascita, false);
	}
	
	Persona2(String nome) {
		this(nome, Persona2.currentYear); // richiama costruttore a 2 arg..
	}

	static int currentYear = Calendar.getInstance().get(Calendar.YEAR);
}