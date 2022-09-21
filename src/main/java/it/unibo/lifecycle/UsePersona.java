package it.unibo.lifecycle;

public class UsePersona {
	public static void main(String[] s) {
		// Persona p1 = new Persona(); NO!!
		Persona p2 = new Persona("Mario Rossi");
		Persona p3 = new Persona("Gino Bianchi", 1979);
		Persona p4 = new Persona("Carlo Verdi", 1971, true);

		System.out.println(p2.nome + ", nato/a nel " + p2.annoNascita + 
			(p2.sposato ? "" : ", non") + " è sposato/a.");
	}
}