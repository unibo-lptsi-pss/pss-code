package it.unibo.advancedmechanisms.enums.en;

import java.util.Arrays;
import java.io.IO;

public class UseRegion {
	public static void main(String[] args) {
		// nella variabile region, si possono usare solo 3 casi
		Region region = Region.MARCHE;
			
		IO.println(region);
		// si ottengono gli array dei valori possibile
		IO.println(Arrays.toString(Region.VALUES));
		// è possibile accedere alla "prossima regione"
		IO.println(Region.VALUES[region.getId()+1]);
	}
}
