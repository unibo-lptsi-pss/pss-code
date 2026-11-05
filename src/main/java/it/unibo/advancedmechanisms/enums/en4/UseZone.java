package it.unibo.advancedmechanisms.enums.en4;
import java.io.IO;

public class UseZone {
	public static void main(String[] args) {
		for (Region r : Region.Zone.NORTH.getRegions()) {
			IO.println("toString "+r); 
			// Emilia Romagna,...,Veneto
			IO.println("name "+r.name());
			// EMILIA_ROMAGNA,...,VENETO
			IO.println("---");
		}
	}
}
