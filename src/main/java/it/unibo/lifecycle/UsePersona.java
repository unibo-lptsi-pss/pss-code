package it.unibo.lifecycle;

public class UsePersona {
	public static void main(String[] s) {
		// Persona p1 = new Persona(); NO!!
		Persona p2 = new Persona("Mario Rossi");
		Persona p3 = new Persona("Gino Bianchi", 1979);
		Persona p4 = new Persona("Carlo Verdi", 1971, true);

		Persona[] persone = new Persona[]{ p2, p3, p4 };
		for(int i=0; i<persone.length; i++){
			System.out.println(persone[i].nome + ", nato/a nel " + persone[i].annoNascita + 
				(persone[i].sposato ? "" : ", non") + " è sposato/a.");
		}
	}
}