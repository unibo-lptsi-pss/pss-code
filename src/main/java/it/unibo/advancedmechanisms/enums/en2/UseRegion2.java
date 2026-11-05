package it.unibo.advancedmechanisms.enums.en2;

import static it.unibo.advancedmechanisms.enums.en2.Region.*;
import java.io.IO;

import java.util.*;

public class UseRegion2 {
	public static void main(String[] args) {
		final ArrayList<Region> list = new ArrayList<>();
		// 4 modi di ottenere una Region
		list.add(Region.LOMBARDIA);
		list.add(SARDEGNA);
		list.add(Region.valueOf("SICILIA"));
		list.add(Region.values()[10]);

		// Le enum sono usabili negli switch
		for (final Region r  : list) {
			switch (r) {
			case LOMBARDIA:
				IO.println("Lombardia");
				break;
			case EMILIA_ROMAGNA:
				IO.println("Emilia Romagna");
				break;
			default:
				IO.println("Altre..");
			}
		}
	}
}
