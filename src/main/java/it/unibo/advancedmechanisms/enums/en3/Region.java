package it.unibo.advancedmechanisms.enums.en3;

import static it.unibo.advancedmechanisms.enums.en3.Zone.*;

public enum Region {
	ABRUZZO(CENTER,"Abruzzo"), 
	BASILICATA(SOUTH,"Basilicata"), 
	CALABRIA(SOUTH,"Calabria"), 
	CAMPANIA(SOUTH,"Campania"), 
	EMILIA_ROMAGNA(NORTH, "Emilia Romagna"), 
	FRIULI_VENEZIA_GIULIA(NORTH, "Friuli Venezia Giula"), 
	LAZIO(CENTER, "Lazio"), 
	LIGURIA(NORTH, "Liguria"), 
	LOMBARDIA(NORTH, "Lombardia"), 
	MARCHE(CENTER, "Marche"),
	MOLISE(SOUTH, "Molise"), 
	PIEMONTE(NORTH, "Piemonte"), 
	PUGLIA(SOUTH, "Puglia"), 
	SARDEGNA(SOUTH, "Sardegna"), 
	SICILIA(SOUTH, "Sicilia"), 
	TOSCANA(CENTER, "Toscana"),
	TRENTINO_ALTO_ADIGE(NORTH, "Trentino Alto Adige"), 
	UMBRIA(CENTER, "Umbria"), 
	VALLE_D_AOSTA(NORTH,"Valle D'Aosta"),
	VENETO(NORTH,"Veneto");
	
	private final Zone zone;
	private final String actualName;
	
	private Region(final Zone zone, final String actualName) {
		this.zone = zone;
		this.actualName = actualName;
	}
	
	public Zone getZone() {
		return this.zone;
	}
	
	public String toString() {
		return this.actualName;
	}
}
