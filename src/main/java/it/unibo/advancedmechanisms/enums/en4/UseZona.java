package it.unibo.advancedmechanisms.enums.en4;
import java.io.IO;

public class UseZona {
	public static void main(String[] args) {
		for (Regione r: Regione.Zona.NORD.getRegioni()){
			IO.println("toString "+r); 
			// Emilia Romagna,...,Veneto
			IO.println("nome "+r.name());
			// EMILIA_ROMAGNA,...,VENETO
			IO.println("---");
		}
	}
}
